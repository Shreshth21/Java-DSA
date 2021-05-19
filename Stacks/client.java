package Stacks;

public class client {
    public static void main(String[] args) {
        vanillaStack stack = new vanillaStack(10);
        stack.push(10);
        stack.push(20);
        stack.display();
    }
}
