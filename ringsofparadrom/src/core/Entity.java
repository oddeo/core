package core;

/**
 *
 * @author danieljones
 */
public enum Entity {
    ASTEROID, PLANET, SHIP;
    
    @Override
    public String toString() {
        switch(this) {
            case ASTEROID: return "Asteroid";
            case PLANET: return "Planet";
            case SHIP: return "Ship";
            default: return "Not Set";
        }
    }
}
