package Strings;

public class Anagram {
    public static void main(String args[]){

        String a = "abcd";
        String b = "bcda";
        System.out.println(anagram(a,b));

    }
    public static boolean anagram(String a, String b){
        int[] arr = new int[26];
        int n = a.length();
        for(int i=0; i<n; i++){
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}
