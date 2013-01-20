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
    Asteroid a1 = new Asteroid(1, Ore.GOLD, 5, 1);
    Asteroid a2 = new Asteroid(2, Ore.GOLD, 5, 1);
    Asteroid a3 = new Asteroid(3, Ore.GOLD, 5, 1);
    ast1.getCollection().add(a1);
    ast2.getCollection().add(a2);
    ast3.getCollection().add(a3);
    plan1.getCollection().add(Entity.PLANET);
    plan2.getCollection().add(Entity.PLANET);
    
    Ship j1 = new Ship(1, (Node)galaxy.getRandomPoint(), 10, 2);
    
    galaxy.toXML();
 
    System.out.println("Attempt Ship move from current to: N2 "); j1.jump(n2);
    j1.setCargo(a1);
    j1.setCargo(a2);
    j1.setCargo(a3);
    System.out.println("Ship Cargo: " + j1.getCargo());
      
    galaxy.toXML();
    
    System.out.println("Attempt Ship move from current to: N0 "); j1.jump(n0);
    j1.setCargo(a1);
    j1.setCargo(a2);
    j1.setCargo(a3);
    System.out.println("Ship Cargo: " + j1.getCargo());
    
    galaxy.toXML(); 
    
    }
    
}
