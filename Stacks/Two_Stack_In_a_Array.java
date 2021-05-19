package Stacks;

public class Two_Stack_In_a_Array {

public static class twoStack {
    int arr[], cap, top1, top2;

    twoStack(int n) {
        cap = n;
        top1 = -1;
        top2 = cap;
        arr = new int[n];
    }

    void push1(int x) {
        if(top1 < top2-1){
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x) {
        if(top1 < top2-1){
            top2--;
            arr[top2] = x;
        }
    }

    int pop1() throws Exception {
        if(top1 >= 0){
            int ans = arr[top1];
            top1--;
            return ans;
        } else {
            throw new Exception("stack is empty");
        }
    }

    int pop2() throws Exception {
        if(top2 < cap){
            int ans = arr[top2];
            top2++;
            return ans;
        } else {
            throw new Exception("stack is empty");
        }
    }

    void display() {
        for (int i = 0; i < cap; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) throws Exception {
        twoStack s = new twoStack(5);
        s.push1(10);
        s.push2(20);
        s.push2(35);
        s.pop1();
        s.display();
    }
}