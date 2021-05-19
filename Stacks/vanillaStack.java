package Stacks;

public class vanillaStack {
    int arr[];
    int cap;
    int top;
    vanillaStack(int c){
        top = -1;
        cap = c;
        arr = new int[cap];
    }
    void push(int item){
        top++;
        arr[top] = item;
    }
    int pop(){
        int res = arr[top];
        top--;
        return res;
    }
    int peek(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return(top==-1);
    }
    void display(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
