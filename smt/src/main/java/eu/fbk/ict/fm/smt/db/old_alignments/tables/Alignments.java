/**
 * This class is generated by jOOQ
 */
package eu.fbk.ict.fm.smt.db.old_alignments.tables;


import eu.fbk.ict.fm.smt.db.old_alignments.Keys;
import eu.fbk.ict.fm.smt.db.old_alignments.TwitterDataset;
import eu.fbk.ict.fm.smt.db.old_alignments.tables.records.AlignmentsRecord;

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
public class Alignments extends TableImpl<AlignmentsRecord> {

    private static final long serialVersionUID = -291766376;

    /**
     * The reference instance of <code>twitter_dataset.alignments</code>
     */
    public static final Alignments ALIGNMENTS = new Alignments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AlignmentsRecord> getRecordType() {
        return AlignmentsRecord.class;
    }

    /**
     * The column <code>twitter_dataset.alignments.resource_id</code>.
     */
    public final TableField<AlignmentsRecord, String> RESOURCE_ID = createField("resource_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>twitter_dataset.alignments.candidates</code>.
     */
    public final TableField<AlignmentsRecord, String> CANDIDATES = createField("candidates", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>twitter_dataset.alignments.names</code>.
     */
    public final TableField<AlignmentsRecord, String> NAMES = createField("names", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>twitter_dataset.alignments.source</code>.
     */
    public final TableField<AlignmentsRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>twitter_dataset.alignments.twitter_id</code>.
     */
    public final TableField<AlignmentsRecord, Long> TWITTER_ID = createField("twitter_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>twitter_dataset.alignments.scores</code>.
     */
    public final TableField<AlignmentsRecord, String> SCORES = createField("scores", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>twitter_dataset.alignments</code> table reference
     */
    public Alignments() {
        this("alignments", null);
    }

    /**
     * Create an aliased <code>twitter_dataset.alignments</code> table reference
     */
    public Alignments(String alias) {
        this(alias, ALIGNMENTS);
    }

    private Alignments(String alias, Table<AlignmentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Alignments(String alias, Table<AlignmentsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<AlignmentsRecord> getPrimaryKey() {
        return Keys.KEY_ALIGNMENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AlignmentsRecord>> getKeys() {
        return Arrays.<UniqueKey<AlignmentsRecord>>asList(Keys.KEY_ALIGNMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Alignments as(String alias) {
        return new Alignments(alias, this);
    }

    /**
     * Rename this table
     */
    public Alignments rename(String name) {
        return new Alignments(name, null);
    }
}
