package Recursion;
import java.util.*;

public class Tower_of_hanoi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n,'A','B', 'C');

    }
    public static void hanoi(int n, char A, char B, char C){

       if(n==0) {
           return;
       }
       hanoi(n-1, A,C,B);
       System.out.println(n+" is moved from "+A+" to "+C);
       hanoi(n-1,B,A,C);

    }
}
