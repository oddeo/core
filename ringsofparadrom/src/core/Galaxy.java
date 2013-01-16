package core;

import java.io.*;
import java.util.*;
import nu.xom.*;

/**
 *
 * @author danieljones
 */
public class Galaxy {
    private LinkedHashMap<String,Object> points;
    
    public Galaxy() {
        this.points = new LinkedHashMap();
    }

    public void putPoint(Object point) {
        this.points.put(point.toString(), point);
    }
    
    public Object getPoint(String key) {
        return points.get(key);
        
    }
    
    public Object getRandomPoint() {
        
        Random randInt = new Random();
        int randPos = randInt.nextInt(this.points.size());
        String key = "n" + randPos;
        
        return points.get(key);
        
    }
        
    public void toXML() throws IOException {
        Element root = new Element("Galaxy");  
        
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator it = points.entrySet().iterator();
        while(it.hasNext()) {
            Element mapPoint = new Element("Point"); 
            Map.Entry point = (Map.Entry)it.next();
            Attribute value = new Attribute("Key", String.valueOf(point.getKey().toString()));
          
            for (Iterator it1 = ((Node)point.getValue()).getConnections().iterator(); it1.hasNext();) {
                Node conn = (Node)it1.next(); 
                Element connection = new Element("Connection");
                connection.appendChild(conn.toString());
                mapPoint.appendChild(connection);
            }
            
            for (Iterator it2 = ((Node)point.getValue()).getCollection().iterator(); it2.hasNext();) {
                Object coll = (Object)it2.next(); 
                Element collection = new Element("Entity");
                collection.appendChild(coll.toString());
                mapPoint.appendChild(collection);
            }
                        
            mapPoint.addAttribute(value);
            root.appendChild(mapPoint);
        }                

        Document doc = new Document(root);
        
        try {
          Serializer serializer = new Serializer(System.out, "ISO-8859-1");
          serializer.setIndent(4);
          serializer.setMaxLength(64);
          serializer.write(doc);  
        }
        catch (IOException ex) {
           System.err.println(ex); 
        } 
    }
    
    
}
