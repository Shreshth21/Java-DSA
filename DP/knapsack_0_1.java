package DP;
import java.util.*;

public class knapsack_0_1{
    public static void main(String[] args){
        int[] wt = {1, 6, 5, 2};
        int[] val = {10, 4, 5, 7};
        int w = 5;
        int n = wt.length;
        //recursive
        System.out.println(recursive(wt,val,w,n));
        
        //for memoization function
        int[][] memo = new int[w+1][n+1];
        for(int[] x:memo) Arrays.fill(x,-1);
        System.out.println(memoization(w, wt, val, n, memo));
        
        //tabulation
        System.out.println(tabulation(wt, val, w, n));
    }
    
    
    
    static int recursive(int[] wt, int[] val, int w, int n){
        if(n==0 || w==0){
            return 0;
        }
        if(wt[n-1]<w){
            return Math.max(val[n-1]+recursive(wt,val,w-wt[n-1],n-1), recursive(wt,val,w,n-1));
        }else{
            return recursive(wt,val,w,n-1);
        }
    }
    
    
    
    
    static int memoization(int w, int[] wt, int[] val, int n, int[][]memo){
        if(n==0 || w==0){
            return 0;
        }
        if(memo[w][n]==-1){
            if(w>=wt[n-1]){
                memo[w][n] = Math.max(val[n-1]+memoization(w-wt[n-1], wt, val, n-1, memo), memoization(w,wt,val,n-1,memo));
            }
            else{
                memo[w][n] = memoization(w,wt,val,n-1,memo);
            }
        }
        return memo[w][n];
    }
    
    
    
    static int tabulation(int[] wt, int[] val, int w, int n){
        int[][] t = new int[n+1][w+1];
        
        //initialization
        //recursion base condition
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= w; j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        
        //choice diagram
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= w; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(t[i-1][j], val[i-1]+t[i-1][j-wt[i-1]]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        //returning the last element (i.e. the biggest problem)
        return t[n][w];
    }
}