package Searching_Sorting;

public class BinarySearch{
    public static void main(String[] args){
        int[] a = {1,5,9,15,25,38};
        System.out.println(search(a, 10, 0, a.length-1));
    }
    static boolean search(int[] a, int target, int low, int high){
        while(low<=high){
            int mid = (low+high)/2;
            System.out.println(low+" "+high);
            if(a[mid] == target){
                return true;
            }
            if(a[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
            
        }
        return false;
    }
}
