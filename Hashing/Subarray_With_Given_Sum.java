package Hashing;

import java.util.HashSet;

public class Subarray_With_Given_Sum{
    public static void main(String[] args){
        HashSet<Integer> h = new HashSet<>();
        int a[] = {5, 8, 6, 3, 3, -1};
        int sum = 24;
        int temp = 0;
        
        for(int i = 0; i < a.length; i++){
            temp += a[i];
            if(h.contains(temp-sum)){
                System.out.println("True");
                return;
            }
            if(temp==sum){
                System.out.println("True");
                return;
            }
            h.add(temp);
        }
        System.out.println("False");
    }
}
