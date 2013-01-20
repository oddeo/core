package core;

/**
 *
 * @author danieljones
 */
public enum Entity {
    PLANET;
    
    @Override
    public String toString() {
        switch(this) {
            case PLANET: return "Planet";
            default: return "Not Set";
        }
    }
}
