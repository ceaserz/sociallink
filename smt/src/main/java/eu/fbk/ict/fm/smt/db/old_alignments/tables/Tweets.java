/**
 * This class is generated by jOOQ
 */
package eu.fbk.ict.fm.smt.db.old_alignments.tables;


import eu.fbk.ict.fm.smt.db.old_alignments.Keys;
import eu.fbk.ict.fm.smt.db.old_alignments.TwitterDataset;
import eu.fbk.ict.fm.smt.db.old_alignments.tables.records.TweetsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tweets extends TableImpl<TweetsRecord> {

    private static final long serialVersionUID = -733222063;

    /**
     * The reference instance of <code>twitter_dataset.tweets</code>
     */
    public static final Tweets TWEETS = new Tweets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TweetsRecord> getRecordType() {
        return TweetsRecord.class;
    }

    /**
     * The column <code>twitter_dataset.tweets.twitter_id</code>.
     */
    public final TableField<TweetsRecord, Long> TWITTER_ID = createField("twitter_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>twitter_dataset.tweets.tweet_id</code>.
     */
    public final TableField<TweetsRecord, Long> TWEET_ID = createField("tweet_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>twitter_dataset.tweets.timestamp</code>.
     */
    public final TableField<TweetsRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>twitter_dataset.tweets.object</code>.
     */
    public final TableField<TweetsRecord, String> OBJECT = createField("object", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>twitter_dataset.tweets</code> table reference
     */
    public Tweets() {
        this("tweets", null);
    }

    /**
     * Create an aliased <code>twitter_dataset.tweets</code> table reference
     */
    public Tweets(String alias) {
        this(alias, TWEETS);
    }

    private Tweets(String alias, Table<TweetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tweets(String alias, Table<TweetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return TwitterDataset.TWITTER_DATASET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TweetsRecord> getPrimaryKey() {
        return Keys.KEY_TWEETS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TweetsRecord>> getKeys() {
        return Arrays.<UniqueKey<TweetsRecord>>asList(Keys.KEY_TWEETS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tweets as(String alias) {
        return new Tweets(alias, this);
    }

    /**
     * Rename this table
     */
    public Tweets rename(String name) {
        return new Tweets(name, null);
    }
}
