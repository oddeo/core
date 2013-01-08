package core;

public class Asteroid implements Entity {
  private String name;
  
  public Asteroid(String name) {
    this.name = name;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
}
