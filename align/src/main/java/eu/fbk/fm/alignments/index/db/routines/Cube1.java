/**
 * This class is generated by jOOQ
 */
package eu.fbk.fm.alignments.index.db.routines;


import eu.fbk.fm.alignments.index.db.Public;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class Cube1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1991545060;

    /**
     * The parameter <code>public.cube.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.cube._1</code>.
     */
    public static final Parameter<Double[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), false, true);

    /**
     * The parameter <code>public.cube._2</code>.
     */
    public static final Parameter<Double[]> _2 = createParameter("_2", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public Cube1() {
        super("cube", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Double[] value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Double[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Double[] value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Double[]> field) {
        setField(_2, field);
    }
}
