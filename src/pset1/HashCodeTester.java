package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Javier Palomares
 * The contract for java.lang.Object additionally requires the following property that relates equals and
    hashCode
    :
    P5 : If two objects are equal according to the equals(Object) method, then calling the hashCode
    method on each of the two objects must produce the same integer result.
 */
public class HashCodeTester
{
    /*
    * P5: If two objects are equal according to the equals(Object)
    * method, then calling the hashCode method on each of
    * the two objects must produce the same integer result.
    */
    // your test methods go here

    @Test
    public void hashCodeTestObject()
    {
        Object o1 = new Object();
        Object o2 = new Object();
        boolean objectsEqual = o1.equals(o2);
        boolean hashCodesEqual = o1.hashCode() == o2.hashCode();
        if(objectsEqual)
        {
            // If the two objects are equal, their hashcodes must be equal
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hasCodeTestC()
    {
        C c1 = new C(0);
        C c2 = new C(0);
        boolean csEqual = c1.equals(c2);
        boolean hashCodesEqual = c1.hashCode() == c2.hashCode();
        if(csEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hasCodeTestD()
    {
        D d1 = new D(0,0);
        D d2 = new D(0,0);
        boolean dsEqual = d1.equals(d2);
        boolean hashCodesEqual = d1.hashCode() == d2.hashCode();
        if(dsEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hashCodeTestObjectAndC()
    {
        Object o = new Object();
        C c = new C(0);
        boolean oAndCEqual = o.equals(c);
        boolean hashCodesEqual = c.hashCode() == o.hashCode();
        if(oAndCEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hashCodeTestObjectAndD()
    {
        Object o = new Object();
        D d = new D(0,0);
        boolean oAndDEqual = o.equals(d);
        boolean hashCodesEqual = d.hashCode() == o.hashCode();
        if(oAndDEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hashCodeTestCAndD()
    {
        C c = new C(0);
        D d = new D(0,0);
        boolean cAndDEqual = c.equals(d);
        boolean hashCodesEqual = c.hashCode() == d.hashCode();
        if(cAndDEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hashCodeTestCAndObject()
    {
        C c = new C(0);
        Object o = new Object();
        boolean cAndOEqual = c.equals(o);
        boolean hashCodesEqual = c.hashCode() == o.hashCode();
        if(cAndOEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hashCodeTestDAndObject()
    {
        D d = new D(0,0);
        Object o = new Object();
        boolean dAndOEqual = d.equals(o);
        boolean hashCodesEqual = d.hashCode() == o.hashCode();
        if(dAndOEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }

    @Test
    public void hashCodeTestDAndC()
    {
        D d = new D(0,0);
        C c  = new C(0);
        boolean dAndCEqual = d.equals(c);
        boolean hashCodesEqual = d.hashCode() == c.hashCode();
        if(dAndCEqual)
        {
            assertTrue(hashCodesEqual);
        }
    }
}
