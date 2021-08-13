package DP;

public class Count_Subset_sum{
    public static void main(String[] args){
        int[] a = {2,3,5,6,8,10};
        int sum = 10;
        System.out.println(function(a,sum));
    }
    
    static int function(int[] a, int sum){
        int n = a.length;
        
        //initialisation
        int[][] t = new int[n+1][sum+1];
        //if sum=0 we always get null subset as 1 ans
        for(int i=0; i<=n; i++){
            t[i][0] = 1;
        }
        for(int i=1; i<=sum; i++){
            t[0][i] = 0;
        }
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                
                if(a[i-1]<=j){
                    t[i][j] = t[i-1][j] + t[i-1][j-a[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
                
            }
        }
        
        //return final biggest problem
        return t[n][sum];
    }
}
