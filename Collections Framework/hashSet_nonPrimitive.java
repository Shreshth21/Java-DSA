package DataStructures;
import java.util.*;

public class hashSet_nonPrimitive{
    public static void main(String[] args){
        
        HashSet<student> h = new HashSet<>();
        h.add(new student("Shreshth", 21));
        h.add(new student("Shreeya", 24));
        h.add(new student("Falguni", 27));
        h.add(new student("Deepa", 50));
        h.add(new student("Kuldeep", 50));
        System.out.println(h);
        
    }
}

class student {
    String name;
    int roll;
    
    student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    
    @Override
    public String toString(){
        return "{name="+name+", roll="+roll+"}";
    }
    
    @Override
    public boolean equals(Object s){
        if(this == s) return true;
        if(s==null || getClass() != s.getClass()) return false;
        student o = (student) s;
        return roll==o.roll;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(roll);
    }
    
}
