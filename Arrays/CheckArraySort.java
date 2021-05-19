package Arrays;

public class CheckArraySort {
    public static void main (String[] args){
        int a[] = {1,2,3,5,1};
        System.out.println(sorted(a));
    }
    public static boolean sorted(int a[]){

        int n = a.length;
        boolean op = true;
        for(int i=0; i<n-1; i++){
            if(a[i]>a[i+1]){
                op = false;
                break;
            }
        }
        return op;
    }
}