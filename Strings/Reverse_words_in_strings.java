package Strings;

public class Reverse_words_in_strings {
    public static void main(String[] args){

        String s = "I love coding";
        int space = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)== ' '){
                s = s.substring(0,space) + reverse(s.substring(space,i)) + " " + s.substring(i+1);
                space = i+1;
            }
        }
        s = s.substring(0,space) + reverse(s.substring(space,s.length()));
        System.out.println(reverse(s));

    }
    public static String reverse(String s){

        String w = "";
        for(int i=s.length()-1; i>=0; i--){
            w += s.charAt(i);
        }
        return w;
    }
}
