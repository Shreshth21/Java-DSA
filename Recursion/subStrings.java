package Recursion;

public class subStrings {
    public static void main(String[] args){

        String s = "abcd";
        function(s,"");

    }
    public static void function(String rem, String ans){

        if(rem.length()==0){
            System.out.println(ans);
        }

        for(int i=1; i<=rem.length(); i++){
            function(rem.substring(i), ans+rem.substring(0,i)+" ");
        }

    }
}
