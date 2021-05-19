package Arrays;

public class MinimumConsecutiveFlips {
    public static void main(String[] args){
        int a[] = {1,0,0,0,1,1,1,0,0};
        int n = a.length;
        int flip = 1^a[0];
        if(a[0]!=a[n-1])
            flip = a[0];
        int i=0;
        while(i<n){
            if(a[i]==flip){
                System.out.print("From "+i+" to ");
                while(a[i]==flip){
                    i++;
                    continue;
                }
                System.out.println(i-1);
            }
            i++;
        }
    }
}
