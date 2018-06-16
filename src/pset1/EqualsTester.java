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
    @Test
    public void testObjectDoesNotEqualNull()
    {
        assertFalse(new Object().equals(null));
    }

    // your test methods for P1 go here

    @Test
    public void testCDoesNotEqualNull()
    {
        C c = new C(0);
        assertFalse(c.equals(null));
    }

    @Test
    public void testDDoesNotEqualNull()
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
    @Test
    public void testObjectIsReflexive()
    {
        Object o = new Object();
        assertTrue(o.equals(o));
    }

    @Test
    public void testCIsReflexive()
    {
        C c = new C(0);
        assertTrue(c.equals(c));
    }

    @Test
    public void testDIsReflexive()
    {
        D d = new D(0,0);
        assertTrue(d.equals(d));
    }

    /*
    * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
    * should return true if and only if y.equals(x) returns true.
    *
    * Equalities to check:
    * 1. Object equals Object
    * 2. C equals C
    * 3. D equals D
    * 4. Object equals C
    * 5. Object equals D
    * 6. C equals D
    */
    // your test methods for P3 go here
    @Test
    public void testObjectIsSymmetric()
    {
        Object o1 = new Object();
        Object o2 = new Object();
        boolean o1EqualsO2 = o1.equals(o2);
        boolean o2EqualsO1 = o2.equals(o1);
        if(o1EqualsO2)
        {
            // If equals() is symmetric, then the 2 booleans must have the same value
            assertTrue(o2EqualsO1);
        }
    }

    @Test
    public void testCIsSymmetric()
    {
        C c1 = new C(0);
        C c2 = new C(0);
        boolean c1EqualsC2 = c1.equals(c2);
        boolean c2EqualsC1 = c2.equals(c1);
        if(c1EqualsC2)
        {
            // Test if C's implementation of equals is symmetric
            assertTrue(c2EqualsC1);
        }
    }

    @Test
    public void testDIsSymmetric()
    {
        D d1 = new D(0,0);
        D d2 = new D(0,0);
        boolean d1EqualsD2 = d1.equals(d2);
        boolean d2EqualsD1 = d2.equals(d1);
        if(d1EqualsD2)
        {
            // Test if D's implementation of equals is symmetric
            assertTrue(d2EqualsD1);

        }
    }

    @Test
    public void testObjectEqualsCIsSymmetric()
    {
        Object o = new Object();
        C c = new C(0);
        boolean oEqualsC = o.equals(c);
        boolean cEqualsO = c.equals(o);
        if(oEqualsC)
        {
            assertTrue(cEqualsO);

        }
    }

    @Test
    public void testObjectEqualsDIsSymmetric()
    {
        Object o = new Object();
        D d = new D(0,0);
        boolean oEqualsD = o.equals(d);
        boolean dEqualsO = d.equals(o);
        if(oEqualsD)
        {
            assertTrue(dEqualsO);
        }
    }

    @Test
    public void testCEqualsDIsSymmetric()
    {
        C c = new C(0);
        D d = new D(0,0);
        boolean cEqualsD = c.equals(d);
        boolean dEqualsC = d.equals(c);
        if(cEqualsD)
        {
            assertTrue(dEqualsC);

        }
    }

    /**
     * TODO: Complete these tests
     */
    @Test
    public void testCEqualsObjectIsSymmetric()
    {
        C c = new C(0);
        Object o = new Object();
        boolean cEqualsO = c.equals(o);
        boolean oEqualsC = o.equals(c);
        if(cEqualsO)
        {
            assertTrue(oEqualsC);
        }
    }

    @Test
    public void testDEqualsObjectIsSymmetric()
    {
        D d = new D(0,0);
        Object o = new Object();
        boolean dEqualsO = d.equals(o);
        boolean oEqualsD = o.equals(d);
        if(dEqualsO)
        {
            assertTrue(oEqualsD);
        }
    }

    @Test
    public void testDEqualsCIsSymmetric()
    {
        D d = new D(0,0);
        C c = new C(0);
        boolean dEqualsC = d.equals(c);
        boolean cEqualsD = c.equals(d);
        if(dEqualsC)
        {
            assertTrue(cEqualsD);
        }
    }

    /*
    * P4: It is transitive: for any non-null reference values x, y, and z,
    * if x.equals(y) returns true and y.equals(z) returns true, then
    * x.equals(z) should return true.
    */
    // you do not need to write tests for P4
}
