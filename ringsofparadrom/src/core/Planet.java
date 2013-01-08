package core;

public class Planet implements Entity {
  private String name;
  
  
  public Planet(String name) {
    this.name = name;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
}
