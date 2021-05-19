package Arrays;
import java.lang.Math;

public class MaxEvenOddSubArray {
    public static void main(String[] args){
        int a[] = {5,10,20,6,3,8};
        int n = a.length;
        int count = 1;
        int res = 1;
        for(int i=1; i<n; i++){
            if(a[i-1]%2 != a[i]%2){
                count++;
                res = Math.max(res,count);
            }
            else{
                count=1;
            }
        }
        System.out.println(res);
    }
}
