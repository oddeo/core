package core;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author danieljones
 */
public class GalaxyTest {

    /**
     * Test of putPoint method, of class Galaxy.
     */
    @Test
    public void testPutPoint() {
        System.out.println("putPoint");
        Object point = new Node("point0");
        Galaxy instance = new Galaxy();
        instance.putPoint(point);
        assertSame(instance.getPoint("point0"), point);
    }


    /**
     * Test of toString method, of class Galaxy.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Galaxy instance = new Galaxy();
        instance.putPoint(new Node("n0"));
        instance.putPoint(new Node("n1"));
        String unexpResult = null;
        String result = instance.toString();
        assertNotNull(result);
    }
}
