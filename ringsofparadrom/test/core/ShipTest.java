/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void testJumpOneNode() throws IllegalMoveException {
        System.out.println("ship jumps one node");
        Node next = new Node("nextNode");
        Node currentNode = new Node("currentNode");
        currentNode.addConnection(next);
        Ship ship = new Ship(0, currentNode, 50);
        ship.jump(next);
        assertTrue(next.getCollection().contains(ship));
    }
    
    /**
     * Test of fuel burned on jump, of class Ship.
     */
    @Test
    public void testBurnFuelOnJump() throws IllegalMoveException {
        System.out.println("ship burns fuel on jump");
        Node next = new Node("nextNode");
        Node currentNode = new Node("currentNode");
        currentNode.addConnection(next);
        Ship ship = new Ship(0, currentNode, 50);
        
        ship.jump(next);
        int actualResult = ship.getFuel();
        int expectedResult = 49;
        
        assertSame(actualResult, expectedResult);
    }    
    
    /**
     * Test of reject move when fuel is out, of class Ship.
     */
    @Test
    public void testOutOfFuelOnJump() throws IllegalMoveException {
        System.out.println("ship cannot jump when out of fuel");
        Node next = new Node("nextNode");
        Node currentNode = new Node("currentNode");
        currentNode.addConnection(next);
        Ship ship = new Ship(0, currentNode, 0);
        
        ship.jump(next);
        boolean actualresult = next.getCollection().contains(ship);
        boolean expectedResult = false;
        
        assertSame(actualresult, expectedResult);
    }  
    
    /**
     * Test of refuel, of class Ship.
     */
    @Test
    public void testRefueltoMaxFuelLimit() throws IllegalMoveException {
        System.out.println("ship can refuel to max fuel limit");
        Node next = new Node("nextNode");
        Node currentNode = new Node("currentNode");
        currentNode.addConnection(next);
        Ship ship = new Ship(0, currentNode, 1);
        
        ship.jump(next);
        
        ship.refuel();
        int actualresult = ship.getFuel();
        int expectedResult = 1;
        
        assertSame(actualresult, expectedResult);
    } 

    /**
     * Test of toString method, of class Ship.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ship ship = new Ship(0, new Node(""), 50);
        String expResult = "Ship: 0";
        String result = ship.toString();
        assertEquals(expResult, result);
    }
}
