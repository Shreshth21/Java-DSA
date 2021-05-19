package Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class subsetSums {
    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        System.out.println(subset(arr,arr.size()));

    }
    public static ArrayList<Integer> subset(ArrayList<Integer> arr, int n){

        ArrayList<Integer> res = new ArrayList<>();
        if(arr.size()==1){
            res.add(0);
            res.add(arr.get(0));
            return res;
        }

        int add = arr.get(0);
        arr.remove(0);
        ArrayList<Integer> remaining = arr;
        ArrayList<Integer> ans = subset(remaining, remaining.size());
        for(int i=0; i<ans.size(); i++){
            res.add(ans.get(i));
            res.add(ans.get(i)+add);
        }
        Collections.sort(res);
        return res;


    }
}
