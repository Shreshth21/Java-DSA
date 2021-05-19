package Stacks;

import java.util.ArrayList;

public class arrayListStack {
    ArrayList<Integer> stack = new ArrayList<>();
    void push(int x){
        stack.add(x);
    }
    int pop(){
        int res = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return res;
    }
    int peek(){
        return stack.get(stack.size()-1);
    }
    boolean isEmpty(){
        return stack.isEmpty();
    }
    int size(){
        return stack.size();
    }
}
