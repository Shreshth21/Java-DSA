package DP;

public class Count_subset_with_given_diff{
    public static void main(String[] args){
        int[] a = {1,1,2,3};
        int diff = 1;
        System.out.println(tabulation(a,diff));
        
    }
    
    static int tabulation(int[] a,  int diff){
        int n = a.length;
        //s2-s1 = diff
        //(sum-s1)-s1 = diff
        //sum - 2s1 = diff
        //s1 = (sum-diff)/2
        
        int sum = 0;
        for(int x: a) sum+=x;
        if((sum-diff)%2!=0) return 0;
        int target = (sum-diff)/2;
        
        //now its a count subset sum problem with sum to be found as target
        
        //initialisation
        int[][] t = new int[n+1][target+1];
        for(int i=0; i<=n; i++) t[i][0] = 1;
        for(int i=1; i<=target; i++) t[0][i] = 0;
        
        //choice diagram
        for(int i=1; i<=n; i++){
            for(int j=1; j<=target; j++){
                if(a[i-1]<=j){
                    t[i][j] = t[i-1][j] + t[i-1][j-a[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
}
