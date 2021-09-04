package DataStructures;
import java.util.*;

public class LinkedList{
    public static void main(String[] args){
    
        //LinkedList implementing List interface
        List<Integer> qe = new java.util.LinkedList<>();  //all the functions of arraylist will work here
        
        //LinkedList implementing Queue interface
        Queue<Integer> q = new java.util.LinkedList<>();
        
        //offer
        q.offer(12);
        q.offer(24);
        q.offer(36);
        q.offer(48);
    
        //poll()
        q.poll();
    
        //peek
        q.peek();
    
    }
}


/*

offer, peek, poll ---> return false, null, null on unsuccessful operation
add, element, remove ---> throws exception on unsuccessful operation

 */