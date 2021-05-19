package Recursion;
//cb yt
public class climbing_stairs {
    public static void main(String[] args){

        int n = 4;
        stair(n,"",0);

    }
    public static void stair(int n, String ans, int curr){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        else if(curr>n)
            return;
        stair(n,ans+"1", curr+1);
        stair(n,ans+"2", curr+2);
        stair(n,ans+"3", curr+3);
    }
}
