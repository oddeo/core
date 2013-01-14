/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author danieljones
 */
public class ShipTest {

    /**
     * Test of jump method, of class Ship.
     */
    @Test
    public void testJump() {
        System.out.println("jump");
        Node next = new Node("nextNode");
        Node currentNode = new Node("currentNode");
        currentNode.addConnection(next);
        Ship ship = new Ship(0, currentNode);
        ship.jump(next);
        assertTrue(next.getCollection().contains(ship));
    }

    /**
     * Test of toString method, of class Ship.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ship ship = new Ship(0, new Node(""));
        String expResult = "Ship: 0";
        String result = ship.toString();
        assertEquals(expResult, result);
    }
}
