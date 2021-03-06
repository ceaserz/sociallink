/**
 * This class is generated by jOOQ
 */
package eu.fbk.fm.alignments.index.db;


import eu.fbk.fm.alignments.index.db.tables.Alignments;
import eu.fbk.fm.alignments.index.db.tables.UserIndex;
import eu.fbk.fm.alignments.index.db.tables.UserObjects;
import eu.fbk.fm.alignments.index.db.tables.UserText;
import eu.fbk.fm.alignments.index.db.tables.UserTextArr;
import eu.fbk.fm.alignments.index.db.tables.records.AlignmentsRecord;
import eu.fbk.fm.alignments.index.db.tables.records.UserIndexRecord;
import eu.fbk.fm.alignments.index.db.tables.records.UserObjectsRecord;
import eu.fbk.fm.alignments.index.db.tables.records.UserTextArrRecord;
import eu.fbk.fm.alignments.index.db.tables.records.UserTextRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AlignmentsRecord> ALIGNMENTS_PKEY = UniqueKeys0.ALIGNMENTS_PKEY;
    public static final UniqueKey<UserIndexRecord> USER_INDEX_PKEY = UniqueKeys0.USER_INDEX_PKEY;
    public static final UniqueKey<UserObjectsRecord> USER_OBJECTS_PKEY = UniqueKeys0.USER_OBJECTS_PKEY;
    public static final UniqueKey<UserTextRecord> USER_TEXT_PKEY = UniqueKeys0.USER_TEXT_PKEY;
    public static final UniqueKey<UserTextArrRecord> USER_TEXT_ARR_PKEY = UniqueKeys0.USER_TEXT_ARR_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AlignmentsRecord> ALIGNMENTS_PKEY = createUniqueKey(Alignments.ALIGNMENTS, "alignments_pkey", Alignments.ALIGNMENTS.RESOURCE_ID, Alignments.ALIGNMENTS.UID);
        public static final UniqueKey<UserIndexRecord> USER_INDEX_PKEY = createUniqueKey(UserIndex.USER_INDEX, "user_index_pkey", UserIndex.USER_INDEX.FULLNAME, UserIndex.USER_INDEX.UID);
        public static final UniqueKey<UserObjectsRecord> USER_OBJECTS_PKEY = createUniqueKey(UserObjects.USER_OBJECTS, "user_objects_pkey", UserObjects.USER_OBJECTS.UID);
        public static final UniqueKey<UserTextRecord> USER_TEXT_PKEY = createUniqueKey(UserText.USER_TEXT, "user_text_pkey", UserText.USER_TEXT.UID);
        public static final UniqueKey<UserTextArrRecord> USER_TEXT_ARR_PKEY = createUniqueKey(UserTextArr.USER_TEXT_ARR, "user_text_arr_pkey", UserTextArr.USER_TEXT_ARR.UID);
    }
}
