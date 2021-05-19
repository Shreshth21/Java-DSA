package BitMagic;

import java.util.Scanner;

public class RightMost_set_bit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int res = a&(~(a-1));
        int answer = (int)(Math.log(res)/Math.log(2))+1;
        System.out.println(answer);


    }
}
