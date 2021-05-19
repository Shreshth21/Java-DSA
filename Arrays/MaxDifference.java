package Arrays;

public class MaxDifference {
    public static void main(String[] args){

        int a[] = {2,3,10,6,4,8,1};
        int n = a.length;
        max(a);

    }
    public static void max(int a[]){

        int n = a.length;
        int min = a[0];
        int res = 0;
        for(int i=0; i<n; i++){
            if (a[i]<min)
                min = a[i];
            if(res<(a[i]-min))
                res = a[i]-min;
        }
        System.out.println(res);

    }

}
