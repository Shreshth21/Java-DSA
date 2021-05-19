package Stacks;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String args[]){
        int[] a = {5,15,10,8,6,12,9,18};
        nge(a);
    }
    public static void nge(int[] a){
        Stack<Integer> s = new Stack<>();

        for(int i=a.length-1; i>=0; i--){
            while(!s.isEmpty() && a[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(-1+", ");
            }else{
                System.out.print(s.peek()+", ");
            }
            s.push(a[i]);
        }
    }
}
