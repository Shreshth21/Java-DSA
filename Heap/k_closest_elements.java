package Heap;
import java.util.*;

public class k_closest_elements{
    static class pair{
        int value;
        int index;
        pair(int a,int b){
            value = a;
            index = b;
        }
    }
    public static void main(String[] args){
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] a = {1,5,7,83,11,45,65,87,12};
        int k = 3;
        int x = 50;
        for(int i=0; i<k; i++){
            pq.add(new pair(Math.abs(x-a[i]), i));
        }
        for(int i=k; i<a.length; i++){
            if(Math.abs(x-a[i])<pq.peek().value){
                pq.poll();
                pq.add(new pair(Math.abs(x-a[i]), i));
            }
        }
        while(!pq.isEmpty()){
            System.out.print(a[pq.poll().index]+" ");
        }
    }
}
