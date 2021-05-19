package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    public static boolean match(char a, char b) {
        if(a == '(' && b == ')'){
            return true;
        } else if(a == '{' && b == '}'){
            return true;
        } else if(a == '[' && b == ']'){
            return true;
        }
        return false;
    }

    public static boolean check(String s) {
        Deque<Character> a = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                a.push(x);
            } else {
                if(a.isEmpty() == true){
                    return false;
                } else if(match(a.peek(), x) == false){
                    return false;
                } else {
                    a.pop();
                }
            }
        }
        return a.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({}[])";
        System.out.print(check(s));
    }
}

