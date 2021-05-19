package Hashing;
import java.util.*;

public class SubarrayZeroSum{
    public static void main(String[] args){
        int a[] = new int[]{-3,2,1};
        HashSet<Integer> h = new HashSet<>();
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
            if(h.contains(sum)){
                System.out.println("True");
                return;
            }
            if(sum==0){
                System.out.println("True");
                return;
            }
            h.add(a[i]);
        }
        System.out.println("False");
    }
}
