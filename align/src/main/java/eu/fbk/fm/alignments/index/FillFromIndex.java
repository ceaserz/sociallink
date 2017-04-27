package eu.fbk.fm.alignments.index;

import com.google.gson.Gson;
import eu.fbk.fm.alignments.Evaluate;
import eu.fbk.fm.alignments.persistence.sparql.Endpoint;
import eu.fbk.fm.alignments.query.QueryAssemblyStrategy;
import eu.fbk.fm.alignments.query.StrictStrategy;
import eu.fbk.fm.alignments.scorer.FullyResolvedEntry;
import eu.fbk.utils.core.CommandLine;
import org.apache.flink.util.IOUtils;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.TwitterException;
import twitter4j.TwitterObjectFactory;
import twitter4j.User;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;

import static eu.fbk.fm.alignments.index.db.tables.UserIndex.USER_INDEX;
import static eu.fbk.fm.alignments.index.db.tables.UserObjects.USER_OBJECTS;

/**
 * Use database to fill the list of candidates for FullyResolvedEntry
 */
public class FillFromIndex implements AutoCloseable {

    private static final Logger LOGGER = LoggerFactory.getLogger(FillFromIndex.class);
    private static final Gson GSON = new Gson();

    private final Connection connection;
    private final DSLContext context;
    private final QueryAssemblyStrategy qaStrategy;
    private final Endpoint endpoint;


    public FillFromIndex(Endpoint endpoint, QueryAssemblyStrategy qaStrategy, String connString, String connUser, String connPassword) throws IOException {
        this.qaStrategy = qaStrategy;
        this.endpoint = endpoint;

        try  {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(connString, connUser, connPassword);
            context = DSL.using(connection, SQLDialect.POSTGRES);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /**
     * @param entry
     */
    public void fill(FullyResolvedEntry entry) {
        entry.candidates = new LinkedList<>();
        entry.resource = endpoint.getResourceById(entry.entry.resourceId);

        String query = qaStrategy.getQuery(entry.resource);
        if (query.length() < 3) {
            LOGGER.error("Query is less than 3 symbols. Ignoring — "+query);
            return;
        }

        context
            .select(USER_OBJECTS.fields())
            .from(USER_INDEX)
            .join(USER_OBJECTS)
            .on(USER_INDEX.UID.eq(USER_OBJECTS.UID))
            .where(
                    "plainto_tsquery({0}) @@ to_tsvector('english', USER_INDEX.FULLNAME)",
                    qaStrategy.getQuery(entry.resource)
            )
            .orderBy(USER_INDEX.FREQ.desc())
            .limit(10)
            .fetchStream()
            .forEach(record -> {
                try {
                    entry.candidates.add(TwitterObjectFactory.createUser(record.get(USER_OBJECTS.OBJECT).toString()));
                } catch (TwitterException e) {
                    LOGGER.error("Error while deserializing user object", e);
                }
            });
    }

    @Override
    public void close() throws Exception {
        IOUtils.closeQuietly(context);
        IOUtils.closeQuietly(connection);
    }

    private static final String DB_CONNECTION = "db-connection";
    private static final String DB_USER = "db-user";
    private static final String DB_PASSWORD = "db-password";
    private static final String ENDPOINT = "endpoint";

    private static CommandLine.Parser provideParameterList() {
        return CommandLine.parser()
                .withOption("c", DB_CONNECTION,
                        "connection string for the database", "DB",
                        CommandLine.Type.STRING, true, false, true)
                .withOption(null, DB_USER,
                        "user for the database", "USER",
                        CommandLine.Type.STRING, true, false, true)
                .withOption(null, DB_PASSWORD,
                        "password for the database", "PASSWORD",
                        CommandLine.Type.STRING, true, false, true)
                .withOption(null, ENDPOINT,
                        "URL to SPARQL endpoint", "ENDPOINT",
                        CommandLine.Type.STRING, true, false, true);
    }

    public static void main(String[] args) throws Exception {
        FullyResolvedEntry entry = new FullyResolvedEntry(new Evaluate.DatasetEntry("http://dbpedia.org/resource/Donald_Trump", null));

        try {
            // Parse command line
            final CommandLine cmd = provideParameterList().parse(args);

            final String dbConnection = cmd.getOptionValue(DB_CONNECTION, String.class);
            final String dbUser = cmd.getOptionValue(DB_USER, String.class);
            final String dbPassword = cmd.getOptionValue(DB_PASSWORD, String.class);
            final String endpointUri = cmd.getOptionValue(ENDPOINT, String.class);

            new FillFromIndex(new Endpoint(endpointUri), new StrictStrategy(), dbConnection, dbUser, dbPassword).fill(entry);

            LOGGER.info("List of candidates for entity: "+entry.entry.resourceId);
            for (User candidate : entry.candidates) {
                LOGGER.info("  "+candidate.getName()+" (@"+candidate.getScreenName()+")");
            }
        } catch (final Throwable ex) {
            // Handle exception
            CommandLine.fail(ex);
        }
    }
}