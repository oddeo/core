package core;

/**
 *
 * @author danieljones
 */
public class Ship {
    private int id;
    private Node currentNode;
    private int fuel;
    private int fuelmax;
    
    public Ship(int id, Node startNode, int fuel) {
        this.id = id;
        this.currentNode = startNode;
        this.addShipToStartingNode();
        this.fuelmax = fuel;
        this.refuel();
    }
    
    private void addShipToStartingNode() {
        this.currentNode.getCollection().add(this);
    }
    
    public void jump(Node next) throws IllegalMoveException {
        
        try {
         
            if(currentNode.getConnections().contains(next)) {
                 if(fuel > 0) {
                   System.out.println("Moved from " + currentNode.toString() + " to: " + next.toString());
                   currentNode.getCollection().remove(this);
                   next.getCollection().add(this);
                   this.currentNode = next;            
                   this.setFuel(this.fuel - 1);
                 } else {
                     throw(new IllegalMoveException("Move denied: Out of fuel"));
                 }
             } else {
                 throw(new IllegalMoveException("Move denied: Out of fuel"));
             }            
            
        } catch (IllegalMoveException ime) {
            System.out.println(ime.getMessage());
        }
    }
    
    public int getFuel() {
        return this.fuel;
    }
    
    private void setFuel(int fuel) {
        this.fuel = fuel;
    }
    
    public final void refuel() {
        this.setFuel(fuelmax);
    }
    
    @Override
    public String toString() {
        return "Ship: " + this.id;
    }   
    
}
