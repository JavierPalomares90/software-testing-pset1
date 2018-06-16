package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Javier Palomares
 */
public class SLListAddTester
{
    /**
     * Asserts that all value of the list
     * true->null
     * equal the expected value
     */
    @Test
    public void test0()
    {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.header != null);
        // your code goes here
        assertTrue(l.header.elem == true);
        assertTrue(l.header.next == null);
    }

    /**
     * Asserts that all value of the list
     * false->true->null
     * equal the expected value
     */
    @Test
    public void test1()
    {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);
        assertTrue(l.repOk());
        l.add(false);
        assertTrue(l.repOk());
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.header != null);
        // your code goes here
        assertTrue(l.header.elem == false);
        assertTrue(l.header.next != null);
        assertTrue(l.header.next.elem == true);
        assertTrue(l.header.next.next == null);

    }

}
