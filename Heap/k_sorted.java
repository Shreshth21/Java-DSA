package Heap;

import java.util.PriorityQueue;

public class k_sorted{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] a = {9, 8, 7, 18, 19, 17};
        int k = 2;
        for(int i = 0; i < k+1; i++){
            pq.add(a[i]);
        }
        int index = 0;
        for(int i = k+1; i < a.length; i++){
            a[index++] = pq.poll();
            pq.add(a[i]);
        }
        while(!pq.isEmpty()){
            a[index++] = pq.poll();
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
