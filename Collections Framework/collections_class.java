package DataStructures;
import java.util.*;

public class collections_class{
    public static void main(String[] args){
        
        List<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(2);
        a.add(13);
        a.add(67);
        a.add(52);
        
        //min element
        System.out.println(Collections.min(a));
        
        //max element
        System.out.println(Collections.max(a));
        
        //frequency
        System.out.println(Collections.frequency(a,2));
        
        //sort
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        
        
    }
}
