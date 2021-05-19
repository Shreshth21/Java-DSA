package Arrays;

public class Second_largest_element {
    public static void main(String[] args){
        int a[] = {12,12,12,7};
        int res = secondLargest(a);
        System.out.println(res);
    }
    public static int secondLargest(int a[]){

        int max1 = 0;
        int max2 = -1;
        int n = a.length;
        for(int i=1; i<n; i++){
            if(a[i]>a[max1]){
                max2 = max1;
                max1 = i;
            }
            else if(a[i]<a[max1]){
                if(max2==-1 || a[i]>a[max2])
                    max2=i;
            }
        }
        return a[max2];

    }
}
