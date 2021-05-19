package Arrays;
import java.lang.Math;

public class TrappingRainWater {
    public static void main(String[] args){

        int a[] = {3,0,1,2,5};
        int n = a.length;
        int maxl[] = new int[n];
        int maxr[] = new int[n];
        int max=a[0];
        for(int i=0; i<n; i++){
            if (a[i]>max)
                max=a[i];
            maxl[i] = max;
        }
        max=a[n-1];
        for(int i=n-1; i>=0; i--){
            if(a[i]>max)
                max=a[i];
            maxr[i]=max;
        }
        int res=0;
        for(int i=0; i<n; i++){
            res += Math.min(maxl[i],maxr[i])-a[i];
        }
        System.out.println(res);
    }
}
