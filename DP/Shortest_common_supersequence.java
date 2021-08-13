package DP;

public class Shortest_common_supersequence{
    public static void main(String[] args){
        
        String x = "AGGTAB";
        String y = "GXTXAYB";
        int n = x.length();
        int m = y.length();
        
        //scs_length = m+n-LCS(x,y)
        System.out.println(m+n-tabulation(x, y, n, m));
        
        //printing supersequence
        System.out.println(print(x, y, n, m));
        
    }
    
    
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
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                }else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
        }
        return t[n][m];
    }
    
    
    static String print(String x, String y, int n, int m){
        
        //initialisation
        int[][] t = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            t[i][0] = 0;
        }
        for(int i = 0; i <= m; i++){
            t[0][i] = 0;
        }
        
        
        //choice diagram
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                }else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
        }
        
        //creating the string that needs to be returned
        String res = "";
        int i = n, j = m;
        while(i > 0 && j > 0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                res = x.charAt(i-1)+res;
                i--;
                j--;
            }else{
                if(t[i-1][j] > t[i][j-1]){
                    res = x.charAt(i-1)+res;
                    i--;
                }else{
                    res = y.charAt(j-1)+res;
                    j--;
                }
            }
        }
        while(i>0){
            res = x.charAt(i-1)+res;
            i--;
        }
        while(j>0){
            res = y.charAt(j-1)+res;
            j--;
        }
        
        return res;
    }
    
}
