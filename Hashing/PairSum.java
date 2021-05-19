package Hashing;
import java.util.*;

public class PairSum{
    public static void main(String[] args){
        int a[] = new int[]{3, 8, 4, 7, 6, 1};
        int sum = 8;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<a.length; i++){
            if(!h.contains(sum-a[i])){
                h.add(a[i]);
            }
            else{
                System.out.println("True");
                System.out.println(h);
                return;
            }
        }
        System.out.println("False");
    }
}
