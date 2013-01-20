package core;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author danieljones
 */
public class GalaxyTest {
    private Galaxy instance;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     * create a new galaxy for each test
     */
    @Before
    public void setupGalaxy() {    
        this.instance = new Galaxy();
        System.setOut(new PrintStream(outContent));
    }
    
    /**
     * Test of putPoint method, of class Galaxy.
     */
    @Test
    public void testPutGetPoint() {
        System.out.println("System can add new point to galaxy");
        Object point = new Node("point0");
        instance.putPoint(point);
        assertSame(instance.getPoint("point0"), point);
    }
    
    /**
     * Test getting a random point in the map, of class Galaxy.
     */
    @Test
    public void testGetRandomPoint() {
        System.out.println("System can get a random point in the galaxy");

        instance.putPoint(new Node("n0"));
        instance.putPoint(new Node("n1"));
        instance.putPoint(new Node("n2"));
        instance.putPoint(new Node("n3"));
        instance.putPoint(new Node("n4"));
        instance.putPoint(new Node("n5"));
        
        boolean notEqual = false;
        String randomPoint1 = instance.getRandomPoint().toString();
        String randomPoint2 = instance.getRandomPoint().toString();
        String randomPoint3 = instance.getRandomPoint().toString();
        String randomPoint4 = instance.getRandomPoint().toString();
        String randomPoint5 = instance.getRandomPoint().toString();
        
        if(!randomPoint1.equals(randomPoint2) ||
           !randomPoint1.equals(randomPoint3) ||
           !randomPoint1.equals(randomPoint4) ||
           !randomPoint1.equals(randomPoint5)) {
            notEqual = true;
        }     
        
        assertTrue(notEqual);
        
    }
    /**
     * Test node put adds node name toXml galaxy map, of class Galaxy.
     */
    @Test
    public void testToXML() throws IOException {
        System.out.println("System can output galaxy map as XML");

        instance.putPoint(new Node("n0"));
        instance.toXML();
        String expectedValue = "<Point Key=\"n0\"";
        assertTrue(outContent.toString().contains(expectedValue));
    }
}
