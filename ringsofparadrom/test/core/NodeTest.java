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
        System.out.println("System can get a collection of entities");
        Node node = new Node("");
        assertTrue(node.getCollection() instanceof List);
    }

    /**
     * Test of toString method, of class Node.
     */
    @Test
    public void testToString() {
        System.out.println("System can output node name to string");
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
        System.out.println("System can get a list of node connections");
        Node node = new Node("");
        assertTrue(node.getConnections() instanceof List);
    }

    /**
     * Test of addConnection method, of class Node.
     */
    @Test
    public void testAddConnection() {
        System.out.println("System can add a node to connections list");
        Node home = new Node("");
        Node connection = new Node("");
        home.addConnection(connection);
        assertTrue(home.getConnections().contains(connection));
    }
}
