package Searching_Sorting;

public class count_sort{
    public static void main(String[] args){
        int[] a = {2,1,4,3,2,1};
        int n = a.length;
        a = sort(a, n);
        for(int i: a) System.out.print(i+" ");
    }
    static int[] sort(int[] a, int n){
        int max = a[0];
        for(int i: a) max = Math.max(max, i);
        int[] temp = new int[max+1];
        for(int i: a) temp[i]++;
        for(int i=1; i<=max; i++){
            temp[i] = temp[i]+temp[i-1];
        }
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int index = a[i];
            res[--temp[index]] = index;
        }
        return res;
    }
}
//a = [2,1,4,3,2,1]
//        0,1,2,3,4      4=max(a)
//temp = [0,2,2,1,1]
//temp = [0,2,4,5,6]
//a[0] = 2, temp[2] = 4, res[4-1] = 2;
// therefore res[--temp[ a[i] ]]