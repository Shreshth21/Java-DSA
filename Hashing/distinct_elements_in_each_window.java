package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class distinct_elements_in_each_window{
    public static void main(String[] args){
        int a[] = {10,20,20,10,30,40,10};
        int k = 4;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0; i<k; i++){
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(h+" "+h.size());
        int index = 0;
        for(int i=k; i<a.length; i++){
            if(h.get(a[index])-1==0) h.remove(a[index]);
            else h.put(a[index], h.get(a[index])-1);
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
            index++;
            System.out.println(h+" "+h.size());
        }
    }
}
