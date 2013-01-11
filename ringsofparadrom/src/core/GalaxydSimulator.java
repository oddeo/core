package core;



import java.util.*;

/**
 * Define user cases for testing
 * @author danieljones
 */
public class GalaxydSimulator {

  public static void main(String[] args) {

        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Node n3 = new Node("n3");
        
        n1.addConnection(n3);
        
        Ship j1 = new Ship(1, n1);
        
        j1.jump(n2);
        j1.jump(n3);
    
  }
}
