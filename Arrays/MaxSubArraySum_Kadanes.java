package Arrays;
import java.lang.Math;

public class MaxSubArraySum_Kadanes {
    public static void main(String[] args){

        int a[] = {-3,8,-2,4,-5,6};
        int res = a[0];
        int maxEnd = a[0];
        int n = a.length;
        for(int i=1; i<n; i++){
            maxEnd = Math.max(a[i],maxEnd+a[i]);
            res = Math.max(res,maxEnd);
        }
        System.out.println(res);
    }
}
