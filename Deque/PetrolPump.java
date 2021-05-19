package Deque;

import java.util.ArrayDeque;

public class PetrolPump {
    static void PP(int[] petrol, int[] distance){
        int n = petrol.length;
        int[] a = new int[n];
        int start =0;
        a[0] = petrol[0] - distance[0];
        if(a[0]<0)
            start = 2;
        //System.out.println(a[0]);
        for(int i=1; i<n; i++){
            int curr = a[i-1];
            a[i] = curr + petrol[i] - distance[i];
            if(a[i]<0)
                start = i+2;
            //System.out.print(a[i]+" ");
        }
        System.out.println(start);
    }

    static void PP_deque(int[] petrol, int[] distance){
        ArrayDeque<Integer> d = new ArrayDeque<>();
        int curr = 0;
        int n = petrol.length;
        for(int i=0; i<2*n; i++){
            i = i%n;
            curr += petrol[i] - distance[i];
            if(curr>=0)
                d.addLast(i);
            while(!d.isEmpty() && curr<0){
                int x = d.getFirst();
                curr -= (petrol[x] - distance[x]);
                d.removeFirst();
            }
            if(d.size()==n)
                break;
        }
        if(curr>=0)
            System.out.println(d.peekFirst()+1);
        else
            System.out.println(-1);
    }


    public static void main(String[] args){
        int[] petrol = {50,10,60,100};
        int[] distance = {30,20,100,10};
        PP(petrol, distance);
        PP_deque(petrol, distance);
    }
}
