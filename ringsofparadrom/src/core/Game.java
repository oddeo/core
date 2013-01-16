package core;

import java.io.IOException;

/**
 *
 * @author danieljones
 */
public class Game {

    public Game() throws IllegalMoveException, IOException {
   
    Node n0 = new Node("n0");
    Node n1 = new Node("n1");
    Node n2 = new Node("n2");      
    
    n0.addConnection(n2);
    n2.addConnection(n0);
        
    Galaxy galaxy = new Galaxy(); 
    galaxy.putPoint((Object)n0);
    galaxy.putPoint((Object)n1);
    galaxy.putPoint((Object)n2);  
    
    Node ast1 = (Node)galaxy.getRandomPoint();
    Node ast2 = (Node)galaxy.getRandomPoint();
    Node ast3 = (Node)galaxy.getRandomPoint();
    Node plan1 = (Node)galaxy.getRandomPoint();
    Node plan2 = (Node)galaxy.getRandomPoint();
    ast1.getCollection().add(Entity.ASTEROID);
    ast2.getCollection().add(Entity.ASTEROID);
    ast3.getCollection().add(Entity.ASTEROID);
    plan1.getCollection().add(Entity.PLANET);
    plan2.getCollection().add(Entity.PLANET);
    
    Ship j1 = new Ship(1, (Node)galaxy.getRandomPoint(), 1);
    
    galaxy.toXML();
 
    System.out.println("Attempt Ship move from current to: N2 "); j1.jump(n2);
      
    galaxy.toXML();
    
    System.out.println("Attempt Ship move from current to: N0 "); j1.jump(n0);
      
    galaxy.toXML(); 
    
    }
    
}
