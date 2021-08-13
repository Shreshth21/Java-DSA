package DP;
import java.util.*;

public class Matrix_chain_multiplication{
    public static void main(String[] args){
        
        int a[] = {10,20,40,30};
        int n = a.length;
        System.out.println(recursive(a,1, n-1));
        
        int[][] t = new int[n+1][n+1];
        for(int[] i:t) Arrays.fill(i,-1);
        System.out.println(memoization(a,1,n-1,t));
    }
    
    
    static int recursive(int[] a, int i, int j){
        if(i>=j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int temp = recursive(a,i,k) + recursive(a,k+1,j) +  a[i-1]*a[k]*a[j];
            ans = Math.min(ans,temp);
        }
        
        return ans;
    }
    
    static int memoization(int[] a, int i, int j, int[][] t){
        if(i>=j){
            return 0;
        }
        
        if(t[i][j]==-1){
            int ans = Integer.MAX_VALUE;
            for(int k=i; k<j; k++){
                int temp = memoization(a,i,k,t) + memoization(a,k+1,j,t) + a[i-1]*a[k]*a[j];
                ans = Math.min(temp, ans);
                t[i][j] = ans;
            }
        }
        
        return t[i][j];
    }
}
