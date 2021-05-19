package Stacks;

import java.util.Stack;

public class previousGreaterElement {
    public static void main(String args[]) {
        int[] a = {20, 30, 10, 5, 15};
        pge(a);
    }

    public static void pge(int[] a) {
        Stack<Integer> s = new Stack<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            while (s.isEmpty()==false && a[i] >= s.peek()) {
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
