package Arrays;

public class freqSortedArray {
    public static void main(String[] args){

        int a[] = {1,2,2,3,3,3,3,3,3,4,4,4};
        int n = a.length;
        int curr = a[0];
        int count = 1;
        for(int i=1; i<n; i++){
            if(a[i]==curr){
                count++;
            }
            else{
                System.out.println(a[i-1]+": "+count);
                count=1;
                curr = a[i];
            }
        }
        System.out.println(a[n-1]+": "+count);

    }
}
