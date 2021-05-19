package Hashing;

import java.util.*;

public class chaining{
    static class hash{
        int bucket;
        ArrayList<LinkedList<Integer>> table;
        
        hash(int x){
            bucket = x;
            table = new ArrayList<LinkedList<Integer>>();
            for(int i = 0; i < bucket; i++)
                table.add(new LinkedList<Integer>());
        }
        
        void delete(int x){
            int key = x % bucket;
            table.get(key).remove((Integer)x);
        }
        
        void insert(int x){
            int key = x % bucket;
            table.get(key).add(x);
        }
        
        boolean search(int x){
            int key = x % bucket;
            return table.get(key).contains(x);
        }
    }
}
class client1{
    public static void main(String args[]){
        chaining.hash h = new chaining.hash(5);
        h.insert(10);
        System.out.println(h.search(10));
        h.delete(10);
        System.out.println(h.search(10));
        
        
    }
}