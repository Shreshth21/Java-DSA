package DataStructures;

import java.util.Set;

public class LinkedHashSet{
    public static void main(String[] args){
        
        Set<Integer> h = new java.util.LinkedHashSet<>();
        //this maintains the order of input with all the properties of set
        //so its basically a ds with ( ll + set ) properties
        
        
        //add()
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        
        System.out.println(h);
        
        //remove()
        h.remove(20);
        
        System.out.println(h);
        
        //      other functions
        //contains()
        //isEmpty()
        //size()
        //clear()
        
    }
}
