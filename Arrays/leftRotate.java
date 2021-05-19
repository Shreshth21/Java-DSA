package Arrays;

public class leftRotate {
    public static void main (String[] args){
        int d = 3;
        int a[] = {1,2,3,4,5,6,7};
        int b[] = rotate(a,d);
        int n = b.length;
        for(int i=0; i<n; i++){
            System.out.print(b[i]+" ");
        }
    }
    public static int[] rotate(int a[], int d){

        int n = a.length;
        a = rev(a,0,d-1);
        a = rev(a,d,n-1);
        a = rev(a,0,n-1);
        return a;

    }
    public static int[] rev(int a[], int low, int high){

        while(high>low){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        return a;
    }
}