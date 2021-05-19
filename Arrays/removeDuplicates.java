package Arrays;

public class removeDuplicates {
    public static void main (String[] args){
        int a[] = {1,1,2,2,3,4,4,4,4};
        int[] b = removeDuplicates1(a);
        int n = b.length;
        for(int i=0; i<n; i++){
            System.out.print(b[i]+" ");
        }
    }
    public static int[] removeDuplicates1(int a[]){

        int n = a.length;
        int new1 = 0;
        for(int i=0; i<n-1; i++){
            if(a[i]!=a[new1]){
                new1++;
                a[new1]=a[i];
            }
        }
        return a;
    }
}
