/**
 * This class is generated by jOOQ
 */
package eu.fbk.ict.fm.smt.db.alignments.tables;


import eu.fbk.ict.fm.smt.db.alignments.Alignments;
import eu.fbk.ict.fm.smt.db.alignments.Keys;
import eu.fbk.ict.fm.smt.db.alignments.tables.records.ProfilesRecord;

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
public class Profiles extends TableImpl<ProfilesRecord> {

    private static final long serialVersionUID = -1257788555;

    /**
     * The reference instance of <code>alignments.profiles</code>
     */
    public static final Profiles PROFILES = new Profiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfilesRecord> getRecordType() {
        return ProfilesRecord.class;
    }

    /**
     * The column <code>alignments.profiles.twitter_id</code>.
     */
    public final TableField<ProfilesRecord, Long> TWITTER_ID = createField("twitter_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>alignments.profiles.username</code>.
     */
    public final TableField<ProfilesRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>alignments.profiles</code> table reference
     */
    public Profiles() {
        this("profiles", null);
    }

    /**
     * Create an aliased <code>alignments.profiles</code> table reference
     */
    public Profiles(String alias) {
        this(alias, PROFILES);
    }

    private Profiles(String alias, Table<ProfilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Profiles(String alias, Table<ProfilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Alignments.ALIGNMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProfilesRecord> getPrimaryKey() {
        return Keys.KEY_PROFILES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProfilesRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfilesRecord>>asList(Keys.KEY_PROFILES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Profiles as(String alias) {
        return new Profiles(alias, this);
    }

    /**
     * Rename this table
     */
    public Profiles rename(String name) {
        return new Profiles(name, null);
    }
}