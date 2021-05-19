package Deque;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);
        d.offerFirst(18);
        d.offerLast(25);
        d.offerFirst(12);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.pollFirst();
        d.pollLast();
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());


        Iterator it = d.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        // iterating through the deque
        for (int x : d)
            System.out.print(x+" ");
        System.out.println();


        //descending iterator
        Iterator it1 = d.descendingIterator();
        while (it1.hasNext())
            System.out.print(it1.next()+" ");
    }
}