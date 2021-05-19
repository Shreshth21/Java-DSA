package Hashing;
import java.util.*;

public class Hash_map{
    public static void main(String[] args){
        HashMap<String, Integer> m = new HashMap<>();
    
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);
    
        // Print size and content
        System.out.println(m);
        System.out.println(m.size());
    
        // Iterating over HashMap
        for(Map.Entry<String, Integer>e : m.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        
        System.out.println(m.containsKey("ide"));
        m.remove("ide");
        System.out.println(m.size());
        System.out.println(m.containsValue(15));
    
        System.out.println(m.get("ide"));
        System.out.println(m.get("practice"));
    }
}
