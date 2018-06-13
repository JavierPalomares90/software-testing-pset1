package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

/**
 * @author Javier Palomares
 */
public class SLListRepOkTester
{
    @Test
    public void t0()
    {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    /**
     * Tests that an acylic test is repOk()
     * Tests will cover all possible lists of up to length 2
     */
    @Test
    public void t1()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = true;
        n.next = null;
        // Initialize a new node that points to the node we just initialized
        Node m = new Node();
        m.elem = true;
        m.next = n;
        l.header = m;
        assertTrue(l.repOk());
    }

    @Test
    public void t2()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = true;
        n.next = null;
        // Initialize a new node that points to the node we just initialized
        Node m = new Node();
        m.elem = false;
        m.next = n;
        l.header = m;
        assertTrue(l.repOk());
    }

    @Test
    public void t3()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = false;
        n.next = null;
        // Initialize a new node that points to the node we just initialized
        Node m = new Node();
        m.elem = false;
        m.next = n;
        l.header = m;
        assertTrue(l.repOk());
    }

    @Test
    public void t4()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = false;
        n.next = null;
        // Initialize a new node that points to the node we just initialized
        Node m = new Node();
        m.elem = true;
        m.next = n;
        l.header = m;
        assertTrue(l.repOk());
    }

    @Test
    public void t5()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = false;
        n.next = null;
        l.header = n;
        assertTrue(l.repOk());
    }

    @Test
    public void t6()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = true;
        n.next = null;
        l.header = n;
        assertTrue(l.repOk());
    }

    /**
     *
     * Tests that an cylic test is not repOk()
     */
    @Test
    public void t1Cyclic()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = true;
        n.next = null;
        Node m = new Node();
        m.elem = true;
        // Make the 2 nodes point at each other to form a cycle
        m.next = n;
        n.next = m;
        l.header = m;
        assertFalse(l.repOk());
    }

    /**
     *
     * Tests that an cylic test is not repOk()
     */
    @Test
    public void t2Cyclic()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = true;
        n.next = null;
        Node m = new Node();
        m.elem = false;
        // Make the 2 nodes point at each other to form a cycle
        m.next = n;
        n.next = m;
        l.header = m;
        assertFalse(l.repOk());
    }

    @Test
    public void t3Cyclic()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = false;
        n.next = null;
        Node m = new Node();
        m.elem = false;
        // Make the 2 nodes point at each other to form a cycle
        m.next = n;
        n.next = m;
        l.header = m;
        assertFalse(l.repOk());
    }

    @Test
    public void t4Cyclic()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = false;
        n.next = null;
        Node m = new Node();
        m.elem = true;
        // Make the 2 nodes point at each other to form a cycle
        m.next = n;
        n.next = m;
        l.header = m;
        assertFalse(l.repOk());
    }

    @Test
    public void t5Cyclic()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = false;
        n.next = n;
        l.header = n;
        assertFalse(l.repOk());
    }

    @Test
    public void t6Cyclic()
    {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        // Initialize a new node that points to null
        n.elem = true;
        n.next = n;
        l.header = n;
        assertFalse(l.repOk());
    }
}
