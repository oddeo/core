package core;

import java.util.*;

/**
 * Define user cases for testing
 * @author danieljones
 */
public class GalaxydSimulator {

  public static void main(String[] args) {

      System.out.println("TEST: Create new nodes");
        Node n0 = new Node("n0");
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        System.out.println("Node is not null: " + n0.getName());
      
      System.out.println("TEST: Create connections between nodes");  
        n0.addConnection(n2);
        System.out.println("# of N0 connections: " + n0.getConnections().size());
      
      System.out.println("TEST: Add nodes to galaxy map");
        Map galaxy = new HashMap();
        galaxy.put("n0", n0);
        galaxy.put("n1", n1);
        galaxy.put("n2", n2);
        System.out.println("# of nodes in galaxy: " + galaxy.size());
        
      System.out.println("TEST: Create new ship specifying current node location");  
        Ship j1 = new Ship(1, n0);
        System.out.println("N0 contains ship: " + n0.getCollection().contains(j1));
        
      System.out.println("TEST: Jump fails when cur node is not connected to new node");
        j1.jump(n1);
      System.out.println("TEST: Jump succeeds when cur node is connected to new node");
        j1.jump(n2);
        
    //Create a random key to pull nodes from the galaxy
    Random randomGen = new Random();
    int randomInt = randomGen.nextInt(3);
    String key = "n" + randomInt;
    
    
    System.out.println("TEST: Add asteroid to random node");
    Node node = (Node)galaxy.get(key);
    node.getCollection().add(Entity.ASTEROID);
    
    //Create a random key to pull nodes from the galaxy
    int randomInt1 = randomGen.nextInt(3);
    String key1 = "n" + randomInt1;
    
    
    System.out.println("TEST: Add planet to random node");
    Node node1 = (Node)galaxy.get(key1);
    node1.getCollection().add(Entity.PLANET);
    
    System.out.println("ASSERT: Display entities within nodes contain Asteroid, Planet or Ship");
    System.out.println(key);    
      for (Iterator it = node.getCollection().iterator(); it.hasNext();) {
          Object entity = (Object)it.next();
          System.out.println(entity);
      }
    
    System.out.println(key1);
      for (Iterator it = node1.getCollection().iterator(); it.hasNext();) {
          Object entity = (Object)it.next();
          System.out.println(entity);
      }
        
        

        
//-- Acceptance Criteria
//1. A ship must be randomly dropped into a node
        //-- xxx figure out how to calc random in java
        //-- build out nodes in a galaxy
        //-- drop in asteroids randomly
        //-- drop in planets randomly
        //-- drop ship into a random empty node
//2. No two ships must be dropped into the same node
//3. Ship will be dropped into node with no other entities (asteroid, planet.. not just other ships)
    
  }
  
}
