/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author danieljones
 */
public class Ship {
    private int id;
    private Node cur;
    
    public Ship(int id, Node cur) {
        this.id = id;
        this.cur = cur;
    }
    
    public void jump(Node next) {
        if(cur.getConnections().contains(next)) {
          System.out.println("Moved from " + cur.getName() + " to: " + next.getName());
          cur.getCollection().remove(this);
          next.getCollection().add(this);
          this.cur = next;            
        }  else {
            System.out.println("Illegal Move");
        }

    }
    
}
