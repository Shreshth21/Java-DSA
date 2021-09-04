package DataStructures;
import java.util.*;

public class ArraysClass{
    public static void main(String[] args){
        
        int[] a = {1,2,3,4,5,6};
        
        //binary search
        System.out.println(Arrays.binarySearch(a,3));
        
        //sorting    (uses quick sort internally for primitive data types)
        Arrays.sort(a);
        
        //fill
        Arrays.fill(a,-1);
        
    }
}
