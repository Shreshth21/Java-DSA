package Strings;

public class pattern_searching_naive {
    public static void main(String[] args){

        String txt = "geeksforgeeks";
        String pattern = "eks";
        int d = pattern.length();
        for(int i=0; i<=txt.length()-d; i++){
            String s1 = txt.substring(i,i+d);
            //System.out.println(s1);
            if(s1.equals(pattern)==true){
                System.out.print(i+" ");
            }
        }
    }
}
