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
    private int cargo;
    private int cargoMax;
    
    public Ship(int id, Node startNode, int fuelMax, int cargoMax) {
        this.id = id;
        this.currentNode = startNode;
        this.addShipToStartingNode();
        this.fuelmax = fuelMax;
        this.refuel();
        this.cargoMax = cargoMax;
        this.cargo = 0;
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

    public int getFuelmax() {
      return fuelmax;
    }
            
    public final void refuel() {
        this.setFuel(fuelmax);
    }

    public void setCargo(int cargo) {
      this.cargo = cargo;
    }

    public int getCargo() {
      return cargo;
    }

    public int getCargoMax() {
      return cargoMax;
    }        
           
    @Override
    public String toString() {
        return "Ship: " + this.id;
    }   
    
}
