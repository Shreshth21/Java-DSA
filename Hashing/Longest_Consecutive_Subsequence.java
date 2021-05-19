package Hashing;

import java.util.HashSet;

public class Longest_Consecutive_Subsequence{
    public static void main(String[] args){
        HashSet<Integer> h = new HashSet<>();
        int a[] = {1, 9, 3, 4, 2, 10, 13};
        for(int x : a) h.add(x);
        int res = 1;
        for(int x : h){
            if(!h.contains(x-1)){
                int temp = 1;
                while(h.contains(x+temp)){
                    temp++;
                }
                res = Math.max(res,temp);
            }
        }
        System.out.println(res);
    }
}
