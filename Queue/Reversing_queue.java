package Queue;

import java.util.*;

public class Reversing_queue {

    static class reverse{
        Queue<Integer> q = new LinkedList<>();

        void display(){
            for(Integer x: q)
                System.out.print(x+" ");
            System.out.println();
        }

        void reversal(){
            Stack<Integer> s = new Stack<>();
            while(!q.isEmpty()){
                s.push(q.remove());
            }
            while(!s.isEmpty()){
                q.add(s.pop());
            }
        }
        void recursive_reversal(Queue<Integer> q){
            if(q.isEmpty())
                return;
            int x = q.remove();
            recursive_reversal(q);
            q.add(x);
        }
    }
    public static void main(String[] args){
        reverse r = new reverse();
        r.q.add(10);
        r.q.add(20);
        r.q.add(30);
        r.q.add(40);
        r.display();
        r.reversal();
        r.display();
        r.recursive_reversal(r.q);
        r.display();

    }
}
