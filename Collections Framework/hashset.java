package DataStructures;
import java.util.HashSet;
import java.util.Set;

public class hashset{
    public static void main(String[] args){
    
        Set<Integer> h = new HashSet<>();
        
        
        //add()
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
    
        System.out.println(h);
        
        //remove()
        h.remove(20);
    
        System.out.println(h);
        
    }
}

/*
other functions:

contains()
isEmpty()
size()
clear()
 */