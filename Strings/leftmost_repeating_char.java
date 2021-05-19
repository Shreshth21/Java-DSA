package Strings;

public class leftmost_repeating_char {
    public static void main(String args[]){

        String s = "abccbd";
        System.out.print(function(s));

    }
    public static int function(String s){

        int arr[] = new int[26];
        int res = -1;
        for(int i=s.length()-1; i>=0; i--){
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']>1){
                res = i;
            }
        }
        return res;
    }
}
