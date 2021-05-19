package Recursion;
import java.util.*;

public class subsets {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        subset(s,"",0);

    }
    public static void subset(String s, String curr , int index ){

        if(index==s.length()){
            System.out.println(curr);
            return;
        }

        subset(s,curr,index+1);
        subset(s,curr+s.charAt(index), index+1);


    }
}
