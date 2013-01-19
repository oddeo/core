package core;

/**
 *
 * @author da101025
 */
public enum Ore {
  GOLD(10), COPPER(5), URANIUM(15), NICKEL(7), TITANIUM(20);
    
  private final int unitValue;
  Ore(int unitValue) {
    this.unitValue = unitValue;
  }
  
  public int unitValue() { return this.unitValue; }
  
  @Override
  public String toString() {
    switch(this) {
      case GOLD: return "Gold";
      case COPPER: return "Copper";
      case URANIUM: return "Uranium";
      case NICKEL: return "Nickel";
      case TITANIUM: return "Titanium";
      default: return "Not set";       
    }
  }
  
}
