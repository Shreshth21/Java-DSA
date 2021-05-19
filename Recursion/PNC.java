package Recursion;
//cb yt(2)
public class PNC {
    public static void main(String[] args){

        permutation("abcd","");

    }
    public static void permutation(String rem, String ans){

        if(rem.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<rem.length(); i++){
            permutation(rem.substring(0,i)+rem.substring(i+1), ans+rem.charAt(i));
        }

    }
}
