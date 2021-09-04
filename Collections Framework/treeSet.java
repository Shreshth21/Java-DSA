package DataStructures;

import java.util.Set;
import java.util.TreeSet;

public class treeSet{
    public static void main(String[] args){
        
        
        // all operations here perform in O(log(n))
        // whereas hashset, and LinkedHashSet perform all operations in O(1)
        
        Set<Integer> h = new TreeSet<>();
        //maintains the properties of a set
        //also the properties of bst
        
        
        //add()
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        
        System.out.println(h);
        
        //remove()
        h.remove(20);
        
        System.out.println(h.toString());
        
        //      other functions
        //contains()
        //isEmpty()
        //size()
        //clear()
        
    }
}
