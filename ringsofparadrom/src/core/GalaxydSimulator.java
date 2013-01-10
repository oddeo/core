package core;



import java.util.*;

/**
 * Define user cases for testing
 * @author danieljones
 */
public class GalaxydSimulator {

  public static void main(String[] args) {

    // create galaxy
    Galaxy g = new Galaxy();
    
    // create nodes
    Node n1 = new Node("Node1");
    Node n2 = new Node("Node2");
    Node n3 = new Node("Node3");
    Node n4 = new Node("Node4");
    Node n5 = new Node("Node5");
    
    // connect nodes
    n1.addConnection("Con1", n2);
    n1.addConnection("Con2", n4); 
    n2.addConnection("Con1", n1);
    n2.addConnection("Con2", n3);
    n3.addConnection("Con1", n2);
    n4.addConnection("Con1", n1);
    n4.addConnection("Con2", n5);
    n5.addConnection("Con1", n4); 
    
    // add entities to nodes
    n1.addEntity("Entity1", Entity.ASTEROID);
    n1.addEntity("Entity2", Entity.SHIP);
    n2.addEntity("Entity1", Entity.PLANET);
    
    // add nodes to galaxy
    g.addPoint("Point1",n2);
    g.addPoint("Point2",n1);
    g.addPoint("Point3",n5);
    g.addPoint("Point4",n4);
    g.addPoint("Point5",n3);
    
    // iterate through all the points in the galaxy
    Set s = g.getPoints().entrySet();
    Iterator it = s.iterator();
          
      while (it.hasNext()) {
          Map.Entry m = (Map.Entry)it.next();          
          String key = (String)m.getKey();          
          Node value = (Node)m.getValue();          
          System.out.println(key + " contains " + value.getName() + " - # of Connections: " + value.getConnections().size()
                  + " - # of Entities: " + value.getEntities().size());
      }
     
    // Added get point value to the Galaxy class.  
    // The intent of this is to be able to look up a node by a point name
    // Once the node is looked up, need to see if it contains a certain type of entity (SHIP - example)
    
  }
}
