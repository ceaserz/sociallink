/**
 * This class is generated by jOOQ
 */
package eu.fbk.fm.alignments.index.db.tables.records;


import eu.fbk.fm.alignments.index.db.tables.UserText;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class UserTextRecord extends UpdatableRecordImpl<UserTextRecord> implements Record2<Long, Object> {

    private static final long serialVersionUID = -267165098;

    /**
     * Setter for <code>public.user_text.uid</code>.
     */
    public void setUid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_text.uid</code>.
     */
    public Long getUid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.user_text.lsa</code>.
     */
    public void setLsa(Object value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_text.lsa</code>.
     */
    public Object getLsa() {
        return (Object) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Object> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Object> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UserText.USER_TEXT.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field2() {
        return UserText.USER_TEXT.LSA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value2() {
        return getLsa();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTextRecord value1(Long value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTextRecord value2(Object value) {
        setLsa(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTextRecord values(Long value1, Object value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserTextRecord
     */
    public UserTextRecord() {
        super(UserText.USER_TEXT);
    }

    /**
     * Create a detached, initialised UserTextRecord
     */
    public UserTextRecord(Long uid, Object lsa) {
        super(UserText.USER_TEXT);

        set(0, uid);
        set(1, lsa);
    }
}
