package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements{
    public static void main(String[] args){
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] arr = {1, 2, 1, 2, 3, 45, 5, 6, 3, 4};
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            if(m.containsKey(key)){
                m.put(key, m.get(key)+1);
            }else{
                m.put(key, 1);
            }
        }
        for(Map.Entry<Integer, Integer> i : m.entrySet())
            System.out.println(i.getKey()+" "+i.getValue());
    }
}
