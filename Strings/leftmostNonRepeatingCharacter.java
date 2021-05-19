package Strings;
import java.util.Arrays;

public class leftmostNonRepeatingCharacter {
    public static void main(String args[]){
        String s = "abbcda";
        System.out.println(function(s));
    }
    public static int function(String s){

        int a[]  = new int[26];
        Arrays.fill(a,-1);
        for(int i=0; i<s.length(); i++){
            if(a[s.charAt(i)-'a']==-1){
                a[s.charAt(i)-'a'] = i;
            }
            else if(a[s.charAt(i)-'a']>0){
                a[s.charAt(i)-'a']=-2;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(a[i]>0){
                res = Math.min(res,a[i]);
            }
        }
        return res;

    }
}
