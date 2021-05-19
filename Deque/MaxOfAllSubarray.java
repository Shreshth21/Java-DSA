package Deque;

import java.util.*;

public class MaxOfAllSubarray {
    static void max(int[] a,int k) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        int n = a.length;
        for(int i=0; i<k; i++){
            while(!d.isEmpty() && a[d.peekLast()]<a[i]){
                d.pollLast();
            }
            d.offerLast(i);
        }
        for(int i=k; i<n; i++){
            System.out.print(a[d.peekFirst()]+" ");

            while ((!d.isEmpty()) && d.peek() <= i - k)
                d.removeFirst();

            while(!d.isEmpty() && a[d.peekLast()]<a[i])
                d.pollLast();

            d.offerLast(i);
        }
        System.out.print(a[d.peek()]);
    }

    public static void main(String args[]) {
        int a[] = {20, 40, 30, 10, 60};
        int k = 3;
        max(a,k);
    }
}
