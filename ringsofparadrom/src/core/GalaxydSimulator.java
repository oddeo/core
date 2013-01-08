package core;



import java.util.*;

public class GalaxydSimulator {

  public static void main(String[] args) {
 
    
//*****  Initialize Game Map ********    
    // create galaxy
    Galaxy g1 = new Galaxy();
    
    // create node
    Node n1 = new Node("n1");
    
    // create entity
    Entity ship1 = new Ship("James");
    Entity ship2 = new Ship("Danny");
    Entity ast1 = new Asteroid("ast1");
    Entity plan1 = new Planet("plan1");
    
    // add entity to node
    n1.addEntity(plan1);
    n1.addEntity(ast1);
    n1.addEntity(ship2);
    n1.addEntity(ship1);
    
    // add node to galaxy
    g1.addNode(n1);
    
    // list entities within a node, within a galaxy 
    for (Iterator i = g1.nodes.iterator(); i.hasNext();) {
      Node node = (Node)i.next();
      
      for (Iterator n = node.entities.iterator(); n.hasNext();) {
        Entity entity = (Entity)n.next();
        
        System.out.println(entity.getName());
        
      }     
      
    }
    
//*****  A Ship can move from one node to a connecting node ******** 
    
    // create a second node
    Node n2 = new Node("n2");
    
    // add the second node to the galaxy
    g1.addNode(n2);
    
    // ship 1 moves from n1 to n2
    //ship1.move("n2");
    
    
  }
}
