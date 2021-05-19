package Recursion;

import java.util.ArrayList;

public class getSubsequences {
    public static void main(String args[]){
        System.out.println(subsequence("abc"));
    }
    
    public static ArrayList<String> subsequence (String str){

        char a = str.charAt(0);
        String b = str.substring(1);
        ArrayList<String> res = new ArrayList<>();
        if(str.length()==1){

            res.add("");
            res.add(str);
            return res;

        }
        ArrayList<String> oldAns = subsequence(b);
        for(int i=0; i<oldAns.size(); i++){
            res.add(oldAns.get(i));
            res.add(a+oldAns.get(i));
        }
        return res;
    }
}
