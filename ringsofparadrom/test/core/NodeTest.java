package core;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author danieljones
 */
public class NodeTest {

    /**
     * Test of getCollection method, of class Node.
     */
    @Test
    public void testGetCollection() {
        System.out.println("getCollection");
        Node node = new Node("");
        assertTrue(node.getCollection() instanceof List);
    }

    /**
     * Test of toString method, of class Node.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Node node = new Node("test");
        String expResult = "test";
        String result = node.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConnections method, of class Node.
     */
    @Test
    public void testGetConnections() {
        System.out.println("getConnections");
        Node node = new Node("");
        assertTrue(node.getConnections() instanceof List);
    }

    /**
     * Test of addConnection method, of class Node.
     */
    @Test
    public void testAddConnection() {
        System.out.println("addConnection");
        Node home = new Node("");
        Node connection = new Node("");
        home.addConnection(connection);
        assertTrue(home.getConnections().contains(connection));
    }
}
