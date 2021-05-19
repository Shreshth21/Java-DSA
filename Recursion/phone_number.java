package Recursion;

public class phone_number {
    private static int sum = 0;
    public static void main(String[] aargs){

        String s = "249";
        function(s,"");
        System.out.println(sum);

    }
    public static void function(String s, String ans){

        if(s.length()==0){
            sum++;
            System.out.println(ans);
            return;
        }

        char a = s.charAt(0); //2
        String remainder = s.substring(1); //49
        String value = values(a); // "abc"
        for(int i=0; i<value.length(); i++){
            function(remainder, ans+value.charAt(i));
        }


    }
    public static String values(char a){
        if(a=='2')
            return "abc";
        else if(a=='3')
            return "def";
        else if(a=='4')
            return "ghi";
        else if(a=='5')
            return "jkl";
        else if(a=='6')
            return "mno";
        else if(a=='7')
            return "pqrs";
        else if(a=='8')
            return "tuv";
        else if(a=='9')
            return "wxyz";
        else
            return "";
    }
}
