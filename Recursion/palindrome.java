package Recursion;
import java.util.*;

public class palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean b = palindrome(s,0,n-1);
        System.out.print(b);

    }
    public static boolean palindrome(String s,int start, int end){

        if(start>=end){
            return true;
        }

        return (s.charAt(start)==s.charAt(end))&(palindrome(s,start+1, end-1));

    }
}
