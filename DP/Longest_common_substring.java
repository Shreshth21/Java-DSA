package DP;

public class Longest_common_substring{
    public static void main(String[] args){
        String x = "acdgh";
        String y = "acedfhr";
        int n = x.length();
        int m = y.length();
    
        System.out.println(recursive(x,y,n,m,0));
        System.out.println(tabulation(x,y,n,m));
    }
    
    
    
    static int recursive(String x, String y, int n, int m, int count){
        if(n==0 || m==0){
            return count;
        }
        
        if(x.charAt(n-1) == y.charAt(m-1)){
            return recursive(x,y,n-1,m-1,count+1);
        }else{
            return Math.max(recursive(x,y,n-1,m,0), recursive(x,y,n,m-1,0)) ;
        }
    }
    
    
    
    static int tabulation(String x, String y, int n, int m){
        
        //initialisation
        int[][] t = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            t[i][0] = 0;
            t[0][i] = 0;
        }
        
        int result = 0;
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(x.charAt(i-1) == y.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                    result = Math.max(result, t[i][j]);
                }else{
                    t[i][j] = 0;
                }
            }
        }
        
        return result;
    }
}

