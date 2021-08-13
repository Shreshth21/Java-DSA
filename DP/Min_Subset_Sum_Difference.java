package DP;

public class Min_Subset_Sum_Difference{
    public static void main(String[] args){
        
        int[] a = {7,6,11,5};
        System.out.println(tabulation(a));
    }
    
    static int tabulation(int[] a){
        int n = a.length;
        int sum1 = 0;
        for(int x: a) sum1+=x;
        
        //because we need to find only 1 subset(s1), the other subset will be sum - s1
        //we are searching for that subset in first half range only so that s2-s1 is always +ve
        int sum = sum1/2;
        
        //initialisation
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i=0; i<=n; i++){
            t[i][0] = true;
        }
        for(int i=1; i<=sum; i++){
            t[0][i] = false;
        }
        
        //table creation via choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                
                if(a[i-1]<=j){
                    t[i][j] =  t[i-1][j] || t[i-1][j-a[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
                
            }
        }
        
        int res = 0;
        for(int i=sum; i>=0; i--){
            if(t[n][i]){
                //s2-s1 = (sum-s1)-s1 = sum - 2*s1
                res = sum1 - (2*i);
                break;
            }
        }
        return res;
    }
}
