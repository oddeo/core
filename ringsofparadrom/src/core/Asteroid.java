package core;

public class Asteroid implements Entity {
  private String name;
  private String test;
  
  public Asteroid(String name) {
    this.name = name;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
}
