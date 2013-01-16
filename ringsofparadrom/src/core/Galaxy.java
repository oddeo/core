package core;

import java.io.IOException;
import java.util.*;
import nu.xom.*;

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
        Element root = new Element("Galaxy");  
        
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator it = points.entrySet().iterator();
        while(it.hasNext()) {
            Element mapPoint = new Element("Point"); 
            Element k = new Element("Key");
            Element v = new Element("Value");
            Map.Entry point = (Map.Entry)it.next();
            
            Attribute value = new Attribute("value", String.valueOf(point.getValue().toString()));
                       

            k.appendChild(point.getKey().toString());
            mapPoint.appendChild(k);
            mapPoint.addAttribute(value);
            root.appendChild(mapPoint);
        }                

        Document doc = new Document(root);
        String result = "";
        
        try {
          Serializer serializer = new Serializer(System.out, "ISO-8859-1");
          serializer.setIndent(4);
          serializer.setMaxLength(64);
          serializer.write(doc);  
        }
        catch (IOException ex) {
           System.err.println(ex); 
        } 
        
        return result;
    }
    
    
}
