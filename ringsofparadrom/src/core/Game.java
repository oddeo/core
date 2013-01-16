package core;

import java.util.*;

/**
 *
 * @author danieljones
 */
public class Game {

    public Game() {
   
    Node n0 = new Node("n0");
    Node n1 = new Node("n1");
    Node n2 = new Node("n2");      
    
    n0.addConnection(n2);
        
    Galaxy galaxy = new Galaxy(); 
    galaxy.putPoint((Object)n0);
    galaxy.putPoint((Object)n1);
    galaxy.putPoint((Object)n2);    
    
    Ship j1 = new Ship(1, n0);
    j1.jump(n1);
    j1.jump(n2);

    
    //Create a random key to pull nodes from the galaxy
    Random randomGen = new Random();
    int randomInt = randomGen.nextInt(3);
    String key = "n" + randomInt;
    
    Node node = (Node)galaxy.getPoint(key);
    node.getCollection().add(Entity.ASTEROID);
    
    int randomInt1 = randomGen.nextInt(3);
    String key1 = "n" + randomInt1;
    
    Node node1 = (Node)galaxy.getPoint(key1);
    node1.getCollection().add(Entity.PLANET);
    
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
      
    System.out.println(galaxy.toString());      
    
        // modify galaxy toString override to return the entire galaxy in JSON
        // place asteroids in random nodes
        // place planets in random nodes
        // place ship in random node
     }
    
}
