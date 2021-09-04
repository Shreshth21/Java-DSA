package DataStructures;
import java.util.*;

public class Priorityqueue{
    public static void main(String[] args){
        
        Queue<Integer> min = new PriorityQueue<>();
        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        min.offer(10);
        max.offer(10);
        min.offer(40);
        max.offer(40);
        min.offer(12);
        max.offer(12);
        min.offer(38);
        max.offer(38);
        System.out.println(min+"\n" + max);
        
        
        //peek
        System.out.println(max.peek());
        
        //poll
        System.out.println(min.poll());
        
    }
}
