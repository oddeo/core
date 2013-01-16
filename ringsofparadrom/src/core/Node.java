package core;

import java.util.*;

/**
 *
 * @author danieljones
 */
public class Node {
    private List collection;
    private List connections;
    private String name;
    
    public Node(String name) {
        this.collection = new LinkedList();
        this.name = name;
        this.connections = new LinkedList();
    }

    public List getCollection() {
        return collection;
    }
    
    public List getConnections() {
        return connections;
    }
    
    public void addConnection(Node node) {
        this.connections.add(node);
    }

    @Override
    public String toString() {
        return this.name;
    }

    
    
    
}