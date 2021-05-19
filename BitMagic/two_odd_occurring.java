package BitMagic;

public class two_odd_occurring {
    public static void main(String[] args) {

        // input
        int[] a = {3,4,3,4,5,4,4,6,7,7};

        int xor = 0;
        //xor of all array elements
        for (int j:a) {
            xor ^= j;
        }

        //finding right most set bit of xor
        int r = xor & (~(xor-1));
        int res1 = 0;
        int res2 = 0;

        for (int j : a) {
            if ((r & j) != 0)
                res1 ^= j;
            else
                res2 ^= j;
        }
        System.out.println(res1+" "+res2);
    }
}
