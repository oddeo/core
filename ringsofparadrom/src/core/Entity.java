package core;

/**
 *
 * @author danieljones
 */
public enum Entity {
    ASTEROID, PLANET;
    
    @Override
    public String toString() {
        switch(this) {
            case ASTEROID: return "Asteroid";
            case PLANET: return "Planet";
            default: return "Not Set";
        }
    }
}
