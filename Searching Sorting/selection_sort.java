package Searching_Sorting;

public class selection_sort{
    public static void main(String[] args){
        
        int[] a = {2,7,3,1,6,9,4};
        int n = a.length;
        sort(a, n);
        for(int i:a) System.out.print(i+" ");
    }
    
    static void sort(int[] a, int n){
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[min]) min = j;
            }
            if(min!=i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
            
        }
    }
}
