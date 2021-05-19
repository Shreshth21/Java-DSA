package Stacks;

public class kStacks {
    public static class stack{
        int arr[];
        int next[];
        int top[];
        int cap;
        int freeTop;
        //constructor
        stack(int k, int n){
            arr = new int[n];

            next = new int[n];
            for(int i=0; i<n; i++){
                next[i] = i+1;
            }
            next[n-1] = -1;

            top = new int[k];
            for(int i=0; i<k; i++){
                top[i] = -1;
            }

            cap = n;
            freeTop = 0;
        }

        //push
        public void push(int x, int sn){
            int i = freeTop;
            arr[i] = x;
            freeTop = next[i];
            next[i] = top[sn];
            top[sn] = i;
        }

        //pop
        public int pop(int sn){
            int i = top[sn];
            top[sn] = next[i];
            next[i] = freeTop;
            freeTop = i;
            return arr[i];
        }

        //display
        public void display(){
            for(int i=0; i<cap; i++){
                System.out.print(arr[i]+", ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int k = 3;
        int n = 6;
        stack s = new stack(k,n);
        s.push(10,0);
        s.push(15,1);
        s.push(20,0);
        s.display();
        s.pop(1);
        s.display();
        s.push(25,2);
        s.display();

    }
}