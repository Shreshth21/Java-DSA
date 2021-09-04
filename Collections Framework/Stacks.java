package DataStructures;
import java.util.Stack;

public class Stacks{
    public static void main(String[] args){
        Stack<String> st = new Stack<>();
        
        //push
        st.push("snake");
        st.push("lion");
        st.push("dog");
        st.push("cat");
        
        //pop
        System.out.println(st.pop());
        
        //peek()
        System.out.println(st.peek());
        
    }
}
