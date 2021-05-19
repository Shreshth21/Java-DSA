package Recursion;
import java.util.*;
import java.lang.*;

public class RodCutting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = maxRod(n,a,b,c);
        System.out.println(res);

    }
    public static int maxRod(int n, int a, int b, int c){

        if(n==0)
            return 0;
        if(n<0)
            return -1;

        int res = Math.max(Math.max(maxRod(n-a, a, b,c), maxRod(n-b, a, b,c)), maxRod(n-c, a, b,c));

        if(res==-1)
            return -1;

        return res+1;

    }
}
