package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Javier Palomares
 * According to the contract for java.lang.Object any correct Java program must satisfy certain properties
    with respect to the equals methods; these properties include:
    P1: For any non-null reference value x, x.equals(null) should return false;
    P2: It is reflexive: for any non-null reference value x, x.equals(x) should return true;
    P3: It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if
    and only if y.equals(x) returns true; and
    P4: It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and
    y.equals(z) returns true, then x.equals(z) should return true;
 */
public class EqualsTester
{
    /*
    * P1: For any non-null reference value x, x.equals(null) should return false.
    */
    @Test public void t0()
    {
        assertFalse(new Object().equals(null));
    }

    // your test methods for P1 go here

    @Test public void testCDoesNotEqualNull()
    {
        C c = new C(0);
        assertFalse(c.equals(null));
    }

    @Test public void testDDoesNotEqualNull()
    {
        D d = new D(0,0);
        assertFalse(d.equals(null));
    }

    /*
    * P2: It is reflexive: for any non-null reference value x, x.equals(x)
    * should return true.
    */
    // your test methods for P2 go here

    /**
     *
     */
    @Test public void t1()
    {
        Object o = new Object();
        assertTrue(o.equals(o));
    }

    @Test public void testCIsReflexive()
    {
        C c = new C(0);
        assertTrue(c.equals(c));
    }

    @Test public void testDIsReflexive()
    {
        D d = new D(0,0);
        assertTrue(d.equals(d));
    }

    /*
    * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
    * should return true if and only if y.equals(x) returns true.
    */
    // your test methods for P3 go here
    @Test public void testObjectIsSymmetric()
    {
        Object o1 = new Object();
        Object o2 = new Object();
        assertFalse(o1.equals(o2));
        assertFalse(o2.equals(o1));
    }

    // your test methods for P3 go here
    @Test public void testObjectIsSymmetric2()
    {
        Object o1 = new Object();
        Object o2 = o1;
        assertTrue(o1.equals(o2));
        assertTrue(o2.equals(o1));
    }

    // your test methods for P3 go here
    @Test public void testCIsSymmetric()
    {
        C c1 = new C(0);
        c1.f = 0;
    }

    /*
    * P4: It is transitive: for any non-null reference values x, y, and z,
    * if x.equals(y) returns true and y.equals(z) returns true, then
    * x.equals(z) should return true.
    */
    // you do not need to write tests for P4
}
