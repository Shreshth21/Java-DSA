package Hashing;
import java.util.*;

public class Longest_Subarray_with_Given_Sum{
    public static void main(String args[]){
        HashMap<Integer,Integer> h = new HashMap<>();
        int a[] = new int[]{8, 3, 1, 5, -6, 6, 2, 2};
        int sum = 4;
        int temp = 0;
        int res = 0;
        for(int i=0; i<a.length; i++){
            temp += a[i];
            if(h.containsKey(temp-sum)){
                res = Math.max(res, i-h.get(temp-sum));
            }
            if(temp==sum)
                res = i+1;
            
            if(!h.containsKey(temp))
                h.put(temp,i);
            
        }
        System.out.println(res);
    }
}
