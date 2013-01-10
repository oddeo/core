package core;

import java.util.*;

/**
 *
 * @author danieljones
 */
public class Node {
    private String name;
    private Map connections;
    private Map entities;
    
    public Node(String name) {
        this.name = name;
        this.connections = new HashMap();
        this.entities = new HashMap();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addConnection(String key, Object value) {
        this.connections.put(key, value);
    }

    public Map getConnections() {
        return connections;
    }
    
    public void addEntity(String key, Object value) {
        this.entities.put(key, value);
    }
    
    public void removeEntity(String key) {
        this.entities.remove(key);
    }

    public Map getEntities() {
        return entities;
    }
    
    
    
    
}
