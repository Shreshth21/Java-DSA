package Arrays;

public class zeroesToEnd {
    public static void main(String[] args){
        int a[] = {1,2,5,0,0,0,3,0,2,0};
        int b[] = zeroes(a);
        int n = b.length;
        for (int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] zeroes(int a[]){

        int count = 0;
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i]!=0) {
                int temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }
        return a;

    }
}
