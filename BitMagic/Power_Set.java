package BitMagic;

import java.util.Scanner;

public class Power_Set {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        for(int i=0; i<(int)Math.pow(2,n); i++){

            for(int j=0; j<n; j++){

                if((i&j) !=0)
                    System.out.print(s.charAt(j));

            }
            System.out.println("\r");

        }


    }
}
