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
    n2.addConnection(n0);
        
    Galaxy galaxy = new Galaxy(); 
    galaxy.putPoint((Object)n0);
    galaxy.putPoint((Object)n1);
    galaxy.putPoint((Object)n2);  
    
    Ship j1 = new Ship(1, n0);
    
    System.out.println(galaxy.toString());
    
    System.out.println("Move from N0 to N1 "); j1.jump(n1); //illegal
    System.out.println("Move from N0 to N2 "); j1.jump(n2);
      
    System.out.println(galaxy.toString());      
    
        // modify galaxy toString override to return the entire galaxy in JSON
        // place asteroids in random nodes
        // place planets in random nodes
        // place ship in random node
     }
    
}
