package Recursion;

public class parantheisis {
    public static void main(String[] args){
        int n = 3;
        bracket(n,2*n, 0 ,0 ,"");
    }
    public static void bracket(int n, int count, int opening, int closing, String answer){
        if(opening<closing)
            return;
        if(opening>n)
            return;
        if(count==0){
            System.out.println(answer);
            return;
        }

        bracket(n,count-1,opening+1, closing, answer+"(");
        bracket(n,count-1,opening, closing+1, answer+")");
    }
}
