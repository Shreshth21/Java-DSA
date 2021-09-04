package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treemap{
    public static void main(String[] args){
        
        //sorts the data based on the key
        TreeMap<String, Integer> h = new TreeMap<>();
        
        //put()
        h.put("one", 1);
        h.put("two", 2);
        h.put("three", 3);
        h.put("four", 4);
        h.put("five", 5);
        System.out.println(h);
    
        //remove()
        h.remove("one");
        
        //putIfAbsent()
        h.putIfAbsent("two", 3);
        h.putIfAbsent("six", 6);
        System.out.println(h);
        
        //contains
        System.out.println(h.containsKey("one"));
        System.out.println(h.containsValue(2));
        
        //isEmpty()
        //clear()
    
    
        //iteration
        for(Map.Entry<String, Integer> e : h.entrySet()){
            System.out.print(e+" ");
        }
        System.out.println();
        
        for(Map.Entry<String, Integer> e : h.entrySet()){
            System.out.print(e.getKey()+","+e.getValue()+ " ");
        }
        System.out.println();
        
        
        for(String s : h.keySet()){
            System.out.print(s+" ");
        }
        System.out.println();
        
        
        for(int s : h.values()){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
