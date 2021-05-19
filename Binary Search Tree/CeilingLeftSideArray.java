package BinarySearchTree;

import java.util.TreeSet;

public class CeilingLeftSideArray{
    public static void main(String args[]){
        int[] a = {2,8,30,15,25,12};
        function(a);
    }
    public static void function(int[] a){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(a[0]);
        System.out.print(-1+" ");
        
        for(int i=1; i<a.length; i++){
            if(t.ceiling(a[i])!=null)
                System.out.print(t.ceiling(a[i])+" ");
            else
                System.out.print(-1+" ");
            t.add(a[i]);
        }
    }
}
