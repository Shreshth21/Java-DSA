package Arrays;

public class max1inBinary {
    public static void main(String[] args){

        int a[] = {1,0,0,1,1,1,1,0,1,1};
        int max=0;
        int count=0;
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i]==1){
                count++;
            }
            else{
                if(count>max)
                    max=count;
                count=0;
            }
        }
        System.out.println(max);

    }
}
