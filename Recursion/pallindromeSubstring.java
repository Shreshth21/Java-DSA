package Recursion;

public class pallindromeSubstring {
    public static void main(String[] args){

        String s = "madam";
        function(s,"");

    }
    public static void function(String rem, String ans){

        if(rem.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=1; i<=rem.length(); i++){
            if(isPallindrome(rem.substring(0,i))==true)
                function(rem.substring(i) , ans+rem.substring(0,i)+"  ");
        }

    }
    public static boolean isPallindrome(String a){

        boolean flag = true;
        int n = a.length();
        for(int i=0; i<n/2; i++){
            if(a.charAt(i)!=a.charAt(n-i-1)){
                flag = false;
                return flag;
            }
        }
        return flag;

    }
}
