package Recursion;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sum(n);
        System.out.println(a);

    }
    public static int sum(int n){

        if(n<10)
            return n;

        return n%10+sum(n/10);

    }
}
