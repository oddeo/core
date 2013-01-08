package core;



public class Ship implements Entity {
  private String name;
  private String CurrentNodeName;
  
  public Ship(String name) {
    this.name = name;
  }
  
  public void Move(String NodeName){
    Node currentNode = GetNodeById(this.CurrentNodeName);
    if(currentNode.connections.contains(NodeName)){
      currentNode.removeEntity(this);
      Node nextNode = GetNodeById(NodeName);
      nextNode.addEntity(this);
    }
  }
  
  @Override
  public String getName() {
    return name;
  }
  
}
