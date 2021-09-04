package Searching_Sorting;

public class insertion_sort{
    public static void main(String[] args){
       
        int[] a = {2,7,3,6,9,4};
        int n = a.length;
        sort(a,n);
        for(int i:a) System.out.print(i+" ");
    }
    static void sort(int[] a, int n){
        for(int i=1; i<n; i++){
            int temp = a[i];
            for(int j=i-1; j>=0; j--){
                if(a[j]>temp) a[j+1] = a[j];
                else {
                    a[j+1] = temp;
                    break;
                }
            }
        }
    }
}