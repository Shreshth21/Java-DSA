//package BitMagic;

import java.util.Scanner;

public class power_of_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n&n-1)==0);

    }
}
