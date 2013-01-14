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

    public void putPoint(Object point) {
        this.points.put(point.toString(), point);
    }
    
    public Object getPoint(Object key) {
        return points.get(key);
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator it = points.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry point = (Map.Entry)it.next();
            sb.append(point.getKey());
            sb.append(":");
            sb.append(point.getValue());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        
        return sb.toString();
    }
    
    
}
