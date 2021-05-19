package Strings;

public class letter_Freq {
    public static void main(String args[]){

        String str = "mananmodi";
        int[] a = new int[26];
         for(int i=0; i<str.length(); i++){
             a[str.charAt(i)-'a']++;
         }
         for(int i=0; i<a.length; i++){
             if(a[i]>0)
                System.out.println((char)(i+'a')+" "+a[i]);
         }
    }
}
