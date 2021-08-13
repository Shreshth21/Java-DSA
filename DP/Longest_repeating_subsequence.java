package DP;

public class Longest_repeating_subsequence{
    public static void main(String[] args){
        String s = "aaabebcd";
        int n = s.length();
        System.out.println(tabulation(s,n));
    }
    static int tabulation(String s, int n){
        
        //initialisation
        int[][] t = new int[n+1][n+1];
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                
                if(s.charAt(i-1)==s.charAt(j-1) && i!=j){
                    t[i][j] = 1+t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
        }
        
        return t[n][n];
    }
}
