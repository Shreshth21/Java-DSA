package DataStructures;

import java.util.*;

public class comparable_comparator{
    public static void main(String[] args){
    
        ArrayList<pair> a = new ArrayList<>();
        a.add(new pair("ghi", 3));
        a.add(new pair("abc", 1));
        a.add(new pair("jkl", 4));
        a.add(new pair("def", 2));
        a.add(new pair("ghi", 7));
        
        //using comparable
        Collections.sort(a);
        System.out.println(a);
        
        
        //using comparator
        Collections.sort(a, new comparator1());
        System.out.println(a);
        
        //using comparator
        Collections.sort(a, new Comparator<pair>(){
            public int compare(pair x, pair y){
                return x.roll - y.roll;
            }
        });
        System.out.println(a);
        
        //using lambda function
        Collections.sort(a, (o1,o2)->o2.roll-o1.roll);
        System.out.println(a);
        
        
    }
}

//class pair
class pair implements Comparable<pair>{
    String name;
    int roll;
    
    pair(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    
    public String toString(){
        return "{name="+name+", roll="+roll+"}";
    }
    
    public int compareTo(pair o){
        return o.roll-this.roll;
    }
    
}

//comparator
class comparator1 implements Comparator<pair>{
    public int compare(pair a, pair b){
        if(a.name.equals(b.name)) return a.roll - b.roll;
        return a.name.compareTo(b.name);
    }
}