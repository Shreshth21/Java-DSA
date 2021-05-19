package Recursion;
import java.util.*;

public class Print_1_to_N {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }

    public static void print(int n){
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
}
