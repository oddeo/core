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
    public void testJumpOneNode() throws IllegalMoveException {
        System.out.println("ship jumps one node");
        Node next = new Node("nextNode");
        Node currentNode = new Node("currentNode");
        currentNode.addConnection(next);
        Ship ship = new Ship(0, currentNode, 50, 20);
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
        Ship ship = new Ship(0, currentNode, 50, 20);
        
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
        Ship ship = new Ship(0, currentNode, 0, 20);
        
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
        Ship ship = new Ship(0, currentNode, 1, 20);
        
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
        Ship ship = new Ship(0, new Node(""), 50, 20);
        String expResult = "Ship: 0";
        String result = ship.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getCargoMax method, of class Ship.
     */
    @Test
    public void testCargoSetMaxLimit() {
        System.out.println("Ship Cargo Max Limit");
        Ship ship = new Ship(0, new Node(""), 50, 20);
        int expectedResult = 20;
        int actualResult = ship.getCargoMax();
        assertEquals(expectedResult, actualResult);
    }    
    
    /**
     * Test of cargo default, of class Ship.
     */
    @Test
    public void testCargoDefaultAmount() {
        System.out.println("Ship Cargo Default Amount");
        Ship ship = new Ship(0, new Node(""), 50, 20);
        int expectedResult = 0;
        int actualResult = ship.getCargo();
        assertEquals(expectedResult, actualResult);
    }     
    
    /**
     * Test of cargo max limit discards extra cargo, of class Ship.
     */
    @Test
    public void testCargoMaxLimitEnforced() {
        System.out.println("Ship discards additional cargo once cargo is full");
        Ship ship = new Ship(0, new Node(""), 50, 20);
        ship.setCargo(21);
        int expectedResult = 20;
        int actualResult = ship.getCargo();
        assertEquals(expectedResult, actualResult);
    }        
    
}
