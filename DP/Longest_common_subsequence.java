package DP;

import java.util.Arrays;

public class Longest_common_subsequence{
    public static void main(String[] args){
        String x = "abcdgh";
        String y = "abedfhr";
        int n = x.length();
        int m = y.length();
        
        //recursion
        System.out.println(recursive(x, y, n, m));
        
        //for memoization
        int[][] memo = new int[n+1][m+1];
        for(int[] q : memo) Arrays.fill(q, -1);
        System.out.println(memoization(x, y, n, m, memo));
        
        //tabulation
        System.out.println(tabulation(x,y,n,m));
        
        //printing LCS
        System.out.println(print1(x,y,n,m));
        System.out.println(print2(x,y,n,m));
    }
    
    //---------------------------------------------------------------------------------------------------------------------
    
    static int recursive(String x, String y, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        
        if(x.charAt(n-1)==y.charAt(m-1)){
            return 1+recursive(x, y, n-1, m-1);
        }else{
            return Math.max(recursive(x, y, n, m-1), recursive(x, y, n-1, m));
        }
    }
    
    //---------------------------------------------------------------------------------------------------------------------
    
    static int memoization(String x, String y, int n, int m, int[][] memo){
        if(n==0 || m==0){
            return 0;
        }
        
        if(memo[n][m]==-1){
            if(x.charAt(n-1)==y.charAt(m-1)){
                memo[n][m] = 1+recursive(x, y, n-1, m-1);
            }else{
                memo[n][m] = Math.max(recursive(x, y, n, m-1), recursive(x, y, n-1, m));
            }
        }
        
        return memo[n][m];
    }
    
    //---------------------------------------------------------------------------------------------------------------------
    
    static int tabulation(String x, String y, int n, int m){
    
        //initialisation
        int[][] t = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            t[i][0] = 0;
        }
        for(int i = 0; i <= m; i++){
            t[0][i] = 0;
        }
        
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                }
                else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
        }
        return t[n][m];
    }
    
    //---------------------------------------------------------------------------------------------------------------------
    
    static String print1(String x, String y, int n, int m){
        
        //initialisation
        int[][] t = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            t[i][0] = 0;
        }
        for(int i = 0; i <= m; i++){
            t[0][i] = 0;
        }
        
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                }
                else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
        }
        
        //creating the string that needs to be returned
        String res = "";
        int i=n, j=m;
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                res = x.charAt(i-1)+res;
                i--;
                j--;
            }else{
                if(t[i-1][j]>t[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        
        return res;
    }
    
    //---------------------------------------------------------------------------------------------------------------------
    
    static String print2(String x, String y, int n, int m){
        
        //initialization
        String[][] t = new String[n+1][m+1];
        for(int i=0; i<=n; i++){
            t[i][0] = "";
        }
        for(int i=0; i<=m; i++){
            t[0][i] = "";
        }
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(x.charAt(i-1) == y.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+x.charAt(i-1);
                }else{
                    String a = t[i-1][j];
                    String b = t[i][j-1];
                    t[i][j] = a.length()>b.length() ? a : b;
                }
                
            }
        }
        return t[n][m];
    }
    //---------------------------------------------------------------------------------------------------------------------
}
