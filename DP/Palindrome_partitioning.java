package DP;
import java.util.*;

public class Palindrome_partitioning{
    public static void main(String[] args){
        
        String s = "anitinb";
        int n = s.length();
        
        //recursive
        System.out.println(recursive(s,0,n-1));
        
        //memoization
        int[][] t = new int[n+1][n+1];
        for(int[] i:t) Arrays.fill(i,-1);
        System.out.println(memoization(s,0,n-1,t));
        
        //memoization optimised
        System.out.println(memoize_optimised(s,0,n-1,t));
    }
    
    static int memoization(String s, int i, int j, int[][] t){
        
        if(i>j || isPalindrome(s,i,j)){
            return 0;
        }
        
        if(t[i][j]==-1){
            int res = Integer.MAX_VALUE;
            for(int k=i; k<j; k++){
                int temp = 1 + memoization(s,i,k,t) + memoization(s,k+1,j,t);
                res = Math.min(res, temp);
                t[i][j] = res;
            }
        }
        return t[i][j];
    }
    
    
    static int memoize_optimised(String s, int i, int j, int[][] t){
        if(i>j || isPalindrome(s,i,j)) return 0;
        
        if(t[i][j]==-1){
            int res = Integer.MAX_VALUE;
            for(int k=i; k<j; k++){
                int left, right;
                if(t[i][k]==-1){
                    left = memoize_optimised(s,i,k,t);
                }else{
                    left = t[i][k];
                }
    
                if(t[k+1][j]==-1){
                    right = memoize_optimised(s,k+1,j,t);
                }else{
                    right = t[k+1][j];
                }
                
                res = Math.min(res, 1+left+right);
                t[i][j] = res;
            }
        }
        
        return t[i][j];
    }
    
    
    static int recursive(String s, int i, int j){
        
        if(i > j || isPalindrome(s, i, j)){
            return 0;
        }
        
        int res = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int temp = 1+recursive(s,i,k)+recursive(s,k+1,j);
            res = Math.min(res,temp);
        }
        return res;
    }
    
    static boolean isPalindrome(String s, int low, int high){
        while(low < high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
}
