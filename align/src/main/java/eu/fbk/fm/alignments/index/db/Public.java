/**
 * This class is generated by jOOQ
 */
package eu.fbk.fm.alignments.index.db;


import eu.fbk.fm.alignments.index.db.tables.UserIndex;
import eu.fbk.fm.alignments.index.db.tables.UserObjects;
import eu.fbk.fm.alignments.index.db.tables.UserText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -2115476871;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.user_index</code>.
     */
    public final UserIndex USER_INDEX = eu.fbk.fm.alignments.index.db.tables.UserIndex.USER_INDEX;

    /**
     * The table <code>public.user_objects</code>.
     */
    public final UserObjects USER_OBJECTS = eu.fbk.fm.alignments.index.db.tables.UserObjects.USER_OBJECTS;

    /**
     * The table <code>public.user_text</code>.
     */
    public final UserText USER_TEXT = eu.fbk.fm.alignments.index.db.tables.UserText.USER_TEXT;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            UserIndex.USER_INDEX,
            UserObjects.USER_OBJECTS,
            UserText.USER_TEXT);
    }
}
