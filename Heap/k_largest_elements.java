package Heap;
import java.util.*;

public class k_largest_elements{
    public static void main(String[] args){
        int[] a = {1,4,5,51,22,54,35,78,12,38,17,71};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<k; i++){
            pq.add(a[i]);
        }
        for(int i=k; i<a.length; i++){
            if(a[i]>pq.peek()){
                pq.poll();
                pq.add(a[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}
