//package BitMagic ;

import java.util.Scanner;

public class kth_bit_set_or_not {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // Method-1
        int one = 1;
        one = one<<(k-1);
        System.out.println((n&one)!=0);

        //Method-2
        n = n>>>(k-1);
        System.out.println((n&1)==1);

    }
}
