package DP;

public class unbounded_knapsack{
    public static void main(String[] args){
        int[] wt = {1, 6, 5, 2};
        int[] val = {10, 4, 5, 7};
        int w = 5;
        
        System.out.println(tabulation(wt,val,w));
    }
    
    static int tabulation(int[] wt, int[] val, int w){
        int n = wt.length;
        
        //initialisation
        int[][] t = new int[n+1][w+1];
        for(int i=0; i<=n; i++) t[i][0] = 0;
        for(int i=0; i<=w; i++) t[0][i] = 0;
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=w; j++){
                
                if(wt[i-1]<=j){
                    t[i][j] = Math.max(t[i-1][j], val[i-1]+t[i][j-wt[i-1]]);
                }else{
                    t[i][j] = t[i-1][j];
                }
                
            }
        }
        
        //returning the final ans
        return t[n][w];
    }
}
