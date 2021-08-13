package DP;

public class coin_change_min_coins{
    public static void main(String[] args){
        int[] a = {1,2,3};
        int sum = 5;
        System.out.println(tabulation(a,sum));
    }
    static int tabulation(int[] a, int sum){
        int n = a.length;
        //initialisation
        int[][] t = new int[n+1][sum+1];
        for(int i=0; i<=sum; i++) t[0][i] = Integer.MAX_VALUE - 1;
        for(int i=1; i<=n; i++) t[i][0] = 0;
        for(int i=1; i<=sum; i++){
            if(i%a[0]==0) t[1][i] = i/a[0];
            else t[1][i] = Integer.MAX_VALUE-1;
        }
        
        //choice diagram
        for(int i=2; i<=n; i++){
            for(int j=1; j<=sum; j++){
                
                if(a[i-1]<=j){
                    t[i][j] = Math.min(t[i-1][j], t[i][j-a[i-1]]+1);
                }else{
                    t[i][j] = t[i-1][j];
                }
                
            }
        }
        return t[n][sum];
    }
}
