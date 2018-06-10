package pset1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Javier Palomares
 */

public class SLList
{
    Node header;
    static class Node
    {
        boolean elem;
        Node next;
    }

    boolean repOk()
    {
        // postcondition: returns true iff <this> is an acyclic list, i.e., // there is no path from a node to itself
        Set<Node> visited = new HashSet<Node>();
        Node n = header;
        while (n != null)
        {
            if (!visited.add(n))
            {
                return false;
            }
            n = n.next;
        }
        return true;
    }

    void add(boolean e)
    {
        // precondition: this.repOk()
        // postcondition: adds <e> in a new node at the beginning of the
        // list; the rest of the list is unmodified
        // your code goes here
        Node n = new Node();
        n.elem = e;
        n.next = header;
        header = n;
    }
}
