package core;



import java.util.*;

public class Galaxy {
  public List nodes;
  
  public Galaxy() {
    this.nodes = new LinkedList();
  }
  
  public void addNode(Node node) {
    this.nodes.add(node);
  }
   
}
