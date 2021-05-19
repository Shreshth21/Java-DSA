package Stacks;

import java.util.Stack;

public class stockSpan {
    public static int[] prevGreater(int[] a){
        Stack<Integer> s = new Stack<>();
        int n = a.length;
        int[] dummy = new int[n];
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                dummy[i] = -1;
            }else{
                dummy[i] = s.peek();
            }
            s.push(i);
        }
        return dummy;
    }
    public static void main(String[] args){
        int a[] = {18,12,13,14,11,16};
        int b[] = prevGreater(a);
        for(int i=0; i<a.length; i++){
            System.out.print(i-b[i] +", ");
        }
    }
}
