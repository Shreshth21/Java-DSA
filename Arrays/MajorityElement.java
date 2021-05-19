package Arrays;

public class MajorityElement {
    public static void main(String[] args){
        int[] a = {1,4,4,2,3,4,4,6,4,4};
        int n = a.length;
        int currentMax = a[0];
        int count=1;
        for(int i=1; i<n; i++){
            if(a[i]==currentMax){
                count++;
            }
            else
                count--;
            if(count==0){
                currentMax = a[i];
                count=1;
            }
        }
        int count1 = 0;
        for (int j : a) {
            if (j == currentMax)
                count1++;
        }
        if(count1>n/2)
            System.out.println(currentMax);
        else
            System.out.println("-1");
    }
}
