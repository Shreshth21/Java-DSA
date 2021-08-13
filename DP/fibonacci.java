package DP;

import java.util.Arrays;

public class fibonacci{
    
    public static void main(String[] args){
        int n = 5;
        
        //recursive
        System.out.println(recursive(5));
        
        //memoization
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        System.out.println(memoization(n, memo));
        
        //tabulation
        System.out.println(tabulation(n));
    }
    
    static int recursive(int n){
        if(n==0 || n==1){
            return n;
        }
        
        return recursive(n-1)+recursive(n-2);
    }
    
    static int memoization(int n, int[] memo){
        if(n==0 || n==1){
            memo[n] = n;
        }
        
        if(memo[n]==-1){
            memo[n] = memoization(n-1, memo)+memoization(n-2, memo);
        }
        
        return memo[n];
    }
    
    
    static int tabulation(int n){
        
        //initialisation
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        //choice diagram
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        
        //return
        return arr[n];
    }
}
