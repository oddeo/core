/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author da101025
 */
public class OreTest {
  
    /**
     * Test of jump method, of class Ship.
     */
    @Test
    public void testGetUnitValue() {
        System.out.println("get unit value from GOLD, ore enum");
        int expectedValue = 10;
        int actualValue = Ore.GOLD.unitValue();
        assertSame(expectedValue, actualValue);
    }
}
