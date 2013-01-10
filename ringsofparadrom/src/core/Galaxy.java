package core;


import java.util.*;

/**
 *
 * @author danieljones
 */
public class Galaxy {
    private Map points;
    
    public Galaxy() {
        this.points = new HashMap();
    }
    
    public void addPoint(String key, Object value) {
        this.points.put(key, value);
    }

    public Map getPoints() {
        return points;
    }
    
    
  
}
