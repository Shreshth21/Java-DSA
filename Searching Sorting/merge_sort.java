package Searching_Sorting;

public class merge_sort{
    public static void main(String[] args){
        int[] a = {2,7,3,1,6,9,4};
        int n = a.length;
        sort(a, 0, n-1);
        for(int i: a) System.out.print(i+" ");
    }
    static void sort(int[] a, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            sort(a, l, mid);
            sort(a, mid+1, r);
            merge(a, l, mid, r);
        }
    }
    static void merge(int[] a, int l, int mid, int r){
        int[] b = new int[a.length];
        int k = l;
        int low = l;
        int high = mid+1;
        while(low<=mid && high<=r){
            if(a[low]<a[high]) b[k++] = a[low++];
            else b[k++] = a[high++];
        }
        while(low<=mid) b[k++] = a[low++];
        while(high<=r)  b[k++] = a[high++];
        for(int i=l; i<=r; i++) a[i] = b[i];
    }
}
