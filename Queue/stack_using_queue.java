package Queue;

import java.util.*;

public class stack_using_queue {
    public static void main(String args[]){
        stacks s = new stacks();
        s.push(5);
        s.push(15);
        s.push(45);
        s.display();
        s.pop();
        s.display();

    }

    static class stacks{
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        int curr_size;

        stacks(){
            curr_size = 0;
        }

        void push(int x){
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
            curr_size++;
        }

        int pop(){
            curr_size--;
            return q1.remove();
        }

        void display(){
            for(int x: q1)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}