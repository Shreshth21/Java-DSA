package Graphs;
import java.util.*;

class Student{
    int roll;
    String name;
    
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    
    public int compareTo(Student o){
        if(this.roll < o.roll){
            return -1;
        }else if(this.roll > o.roll){
            return 1;
        }
        return 0;
    }
}
class name_then_roll implements Comparator<Student>{
    
    public int compare(Student o1, Student o2){
        if(o1.name.equals(o2.name)){
            return o1.roll-o2.roll;
        }else{
            return o1.name.compareTo(o2.name);
        }
        
    }
}
public class comparator_comparable{
    public static void main(String[] args){
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(10, "shrey"));
        s.add(new Student(1, "salty"));
        s.add(new Student(20, "xyz"));
        s.add(new Student(14, "shree"));
        s.add(new Student(17, "fal"));
        s.add(new Student(89, "fal"));
        
        Collections.sort(s, new name_then_roll());
        
        for(Student x : s)
            System.out.println(x.name+"  "+x.roll);
        
    }
}