/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danieljones
 */
public class AsteroidTest {
    
    // 
    // test the mine method of an asteroid
    //
     @Test
     public void testShipCanMine() throws IllegalMoveException {
         System.out.println("Asteroid can be mined by a ship");
         Node n1 = new Node("n1");
         Asteroid a1 = new Asteroid(1, Ore.TITANIUM, 25, 21);
         n1.getCollection().add(a1);
         Ship ship = new Ship(1, n1, 10, 10);
         ship.setCargo(a1);
         int expectedValue = 10;
         int actualValue = ship.getCargo();
         assertSame(expectedValue, actualValue);
     }
     
    // 
    // test the mine method of an asteroid
    //
     @Test
     public void testMineReturnsYieldAmount() throws IllegalMoveException {
         System.out.println("Asteroid can be queried for mine yield amount");
         Asteroid a1 = new Asteroid(1, Ore.TITANIUM, 20, 2);
         int expectedValue = 2;
         int actualValue = a1.mineYield();
         assertSame(expectedValue, actualValue);
     }     
}
