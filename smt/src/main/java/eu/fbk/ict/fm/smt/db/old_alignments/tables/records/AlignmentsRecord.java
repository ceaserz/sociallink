/**
 * This class is generated by jOOQ
 */
package eu.fbk.ict.fm.smt.db.old_alignments.tables.records;


import eu.fbk.ict.fm.smt.db.old_alignments.tables.Alignments;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AlignmentsRecord extends UpdatableRecordImpl<AlignmentsRecord> implements Record6<String, String, String, String, Long, String> {

    private static final long serialVersionUID = -1299736822;

    /**
     * Setter for <code>twitter_dataset.alignments.resource_id</code>.
     */
    public void setResourceId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>twitter_dataset.alignments.resource_id</code>.
     */
    public String getResourceId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>twitter_dataset.alignments.candidates</code>.
     */
    public void setCandidates(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>twitter_dataset.alignments.candidates</code>.
     */
    public String getCandidates() {
        return (String) get(1);
    }

    /**
     * Setter for <code>twitter_dataset.alignments.names</code>.
     */
    public void setNames(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>twitter_dataset.alignments.names</code>.
     */
    public String getNames() {
        return (String) get(2);
    }

    /**
     * Setter for <code>twitter_dataset.alignments.source</code>.
     */
    public void setSource(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>twitter_dataset.alignments.source</code>.
     */
    public String getSource() {
        return (String) get(3);
    }

    /**
     * Setter for <code>twitter_dataset.alignments.twitter_id</code>.
     */
    public void setTwitterId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>twitter_dataset.alignments.twitter_id</code>.
     */
    public Long getTwitterId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>twitter_dataset.alignments.scores</code>.
     */
    public void setScores(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>twitter_dataset.alignments.scores</code>.
     */
    public String getScores() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Long, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Long, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Alignments.ALIGNMENTS.RESOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Alignments.ALIGNMENTS.CANDIDATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Alignments.ALIGNMENTS.NAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Alignments.ALIGNMENTS.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Alignments.ALIGNMENTS.TWITTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Alignments.ALIGNMENTS.SCORES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCandidates();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getTwitterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getScores();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlignmentsRecord value1(String value) {
        setResourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlignmentsRecord value2(String value) {
        setCandidates(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlignmentsRecord value3(String value) {
        setNames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlignmentsRecord value4(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlignmentsRecord value5(Long value) {
        setTwitterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlignmentsRecord value6(String value) {
        setScores(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlignmentsRecord values(String value1, String value2, String value3, String value4, Long value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AlignmentsRecord
     */
    public AlignmentsRecord() {
        super(Alignments.ALIGNMENTS);
    }

    /**
     * Create a detached, initialised AlignmentsRecord
     */
    public AlignmentsRecord(String resourceId, String candidates, String names, String source, Long twitterId, String scores) {
        super(Alignments.ALIGNMENTS);

        set(0, resourceId);
        set(1, candidates);
        set(2, names);
        set(3, source);
        set(4, twitterId);
        set(5, scores);
    }
}
