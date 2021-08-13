package DP;

public class Subset_Sum{
    public static void main(String[] args){
        int[] a = {2, 3, 7, 1, 10};
        int sum = 10;
        
        //recursive
        System.out.println(recursive(a, sum, a.length));
        
        //tabulation
        System.out.println(tabulation(a, sum));
    }
    
    static boolean recursive(int[] a, int sum, int index){
        if(sum==0){
            return true;
        }
        if(index==0){
            return false;
        }
        if(sum >= a[index-1]){
            return recursive(a, sum, index-1) || recursive(a, sum-a[index-1], index-1);
        }else{
            return recursive(a,sum,index-1);
        }
    }
    
    
    static boolean tabulation(int[] a, int sum){
        int n = a.length;
        boolean[][] t = new boolean[n+1][sum+1];
        
        //initialization
        for(int i = 0; i <= n; i++){
            t[i][0] = true;
        }
        for(int j = 1; j <= sum; j++){
            t[0][j] = false;
        }
        
        //choice diagram
        //same as knapsack pick or not pick
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                //if the sum is greater than the curr element
                if(a[i-1] <= j){
                    t[i][j] = t[i-1][j] || t[i-1][j-a[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[n][sum];
    }
}
