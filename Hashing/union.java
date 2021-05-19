package Hashing;

import java.util.HashSet;

public class union{
    public static void main(String[] args){
        int[] a = {15, 17, 27, 27, 28, 15};
        int[] b = {16, 17, 28, 17, 31, 17};
        int res = 0;
        HashSet<Integer> m = new HashSet<>();
        for(int i=0; i<a.length; i++){
            int key = a[i];
            m.add(key);
        }
        for(int i=0; i<b.length; i++){
            int key = b[i];
            m.add(key);
        }
        System.out.println(m);
    }
}
