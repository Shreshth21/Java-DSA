package Searching_Sorting;

public class quick_sort{
    public static void main(String[] args){
        int[] a = {2,7,3,1,6,9,4};
        int n = a.length;
        sort(a, 0, n-1);
        for(int i: a)System.out.print(i+" ");
    }
    static void sort(int[] a, int l, int r){
        if(l<r){
            int part = partition(a, l, r);
            sort(a, l, part-1);
            sort(a,part+1, r);
        }
    }
    
    static int partition(int[] a, int l, int r){
        int pivot = a[l];
        int i=l, j=r;
        while(i<j){
            while(a[i]<=pivot)i++;
            while(a[j]>pivot) j--;
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[l] = a[j];
        a[j] = pivot;
        return j;
    }
}
