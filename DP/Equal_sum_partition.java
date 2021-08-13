package DP;

public class Equal_sum_partition{
    public static void main(String[] args){
        int[] a = {1,5,11,5};
        System.out.println(tabulation(a));
        
    }
    static boolean tabulation(int[] a){
        
        int n = a.length;
        
        int sum = 0;
        for(int x: a) sum+=x;
       
        //if there is equal sum then sum of array = 2*(equal part) = even
        if(sum%2!=0) return false;
       
        //we will do subset sum for half of the sum
        sum = sum/2;
       
        //initialisation
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i=0; i<=n; i++){
            t[i][0] = true;
        }
        for(int i=1; i<=sum; i++){
            t[0][i] = false;
        }
       
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                
                if(a[i-1]<=j){
                    t[i][j] = t[i-1][j] || t[i-1][j-a[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
                
            }
        }
        
        //returning the answer
        return t[n][sum];
    }
}
