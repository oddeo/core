package core;



import java.util.*;

class Node {
  public String name;
  public List entities;
  public List connections;
  
  public Node(String name) {
    this.entities = new LinkedList();
    this.connections = new LinkedList();
    this.name = name;
  }
  
  public void addEntity(Entity entity) {
    this.entities.add(entity);
  } 
  
  public void removeEntityById(Entity entity) {
    this.entities.remove(entity);
  }
  
  public void addConnection(String nodeName) {
    this.connections.add(nodeName);
  }
  
}
