//package Arrays;

public class LargestElement {
    public static void main(String[] args){

        int a[] = {5,4,3,9,7,5,8,1};
        int n = a.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(a[max]<a[i])
                max = i;
        }
        System.out.println(max);
    }
}
