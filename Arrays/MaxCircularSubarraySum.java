package Arrays;
import java.lang.Math;

public class MaxCircularSubarraySum {
    public static void main(String[] args){

        int a[] = {-29, 9, 21 ,-4 ,-19 ,-15 ,-4 ,17 ,-14, 19 ,25 ,2 ,-15 ,23 ,-10 ,10 ,-22 ,-29 ,-10 ,-20 ,-1, 22 ,20, 10, 2};
        int n = a.length;
        int normal_max = kadane(a);
        if(normal_max<0) {
            System.out.println(normal_max);
            return;
        }
        int arraySum=0;
        for(int i=0; i<n;i++){
            arraySum += a[i];
            a[i] = -a[i];
        }
        int circular_max = arraySum+kadane(a);
        System.out.println(Math.max(circular_max,normal_max));

    }
    public static int kadane(int[] a){

        int n = a.length;
        int max = a[0];
        int res = 0;
        for(int i=1; i<n; i++){
            max = Math.max(a[i],max+a[i]);
            res = Math.max(res,max);
        }
        return res;
    }
}
