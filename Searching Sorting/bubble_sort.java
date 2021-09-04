package Searching_Sorting;

public class bubble_sort{
    public static void main(String[] args){
        int[] a = {2,7,3,1,6,9,4};
        int n = a.length;
        sort(a, n);
        for(int i: a) System.out.print(i+" ");
    }
    static void sort(int[] a, int n){
        for(int i=0; i<n; i++){
            boolean flag = true;
            for(int j=1; j<n-i; j++){
                if(a[j-1]>a[j]){
                    flag = false;
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
            if(flag) break;
        }
    }
}
