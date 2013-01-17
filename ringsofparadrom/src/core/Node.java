package core;

import java.util.*;

/**
 *
 * @author danieljones
 */
public class Node {
    private LinkedList<Object> collection;
    private LinkedList<Node> connections;
    private String name;
    
    public Node(String name) {
        this.collection = new LinkedList<>();
        this.name = name;
        this.connections = new LinkedList<>();
    }

    public LinkedList<Object> getCollection() {
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