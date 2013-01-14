package core;

/**
 *
 * @author danieljones
 */
public class Ship {
    private int id;
    private Node currentNode;
    
    public Ship(int id, Node startNode) {
        this.id = id;
        this.currentNode = startNode;
        this.addShipToStartingNode();
    }
    
    private void addShipToStartingNode() {
        this.currentNode.getCollection().add(this);
    }
    
    public void jump(Node next) {
        if(currentNode.getConnections().contains(next)) {
          System.out.println("Moved from " + currentNode.toString() + " to: " + next.toString());
          currentNode.getCollection().remove(this);
          next.getCollection().add(this);
          this.currentNode = next;            
        }  else {
            System.out.println("Illegal Move");
        }

    }
    
    @Override
    public String toString() {
        return "Ship: " + this.id;
    }   
    
}
