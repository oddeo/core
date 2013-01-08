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
    
    
// TODO
// * Randomly spawn a ship in a node within a galaxy
    // -- Acceptance Criteria
    // 1. A ship must be randomly dropped into a node
    // 2. No two ships must be dropped into the same node
    // 3. Ship will be dropped into node with no other entities (asteroid, planet.. not just other ships)
    
// * As a ship, I will be notified of the activity occuring within my current node
    // -- Acceptance Criteria
    // 1.  A node will notify me of ships arriving
    // 2.  A node will notify me of ships departing

// * As a ship, I want to be able to attack another ship within the same node
    // -- Acceptance Criteria
    // 1. A ship will identify another ship to attack
    // 2. Attacks are turn based
    // 3. A ship will specify the number of fighters to use in the attack
    
// * As a ship, I want to move from node to node
    // -- Acceptance Criteria
    // 1. A ship will choose from the list of connections available in the node
    // 2. A node must reveal a list of its entities and options
    // 3. A node must prompt the ship for a command
    
// * As a ship, I will gain 1 point of energy every hour whether I am playing online or not
    // -- Acceptance Criteria
    // 1.  A ship has a maximum limit of energy 
    // 2.  A ship uses 1 point of energy for each move
    // 3.  When a ship runs out of energy they cannot move until another point is gained
    
// * As a ship, I will play a game until the season ends
    // -- Acceptance Criteria
    // 1.  A universe will generate a map when a season begins that contains multiple galaxies
    // 2.  Ships can enter a universe once a season begins
    // 3.  A universe will tally points for each ship and report status at the end of a season
    
  }
}
