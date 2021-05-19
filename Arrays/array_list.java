package Arrays;
import java.util.ArrayList;

public class array_list {
    public static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();
        //add
        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits.get(1));

        //set
        fruits.set(1,"pineapple");
        System.out.println(fruits);
        fruits.add("kiwi");
        fruits.add("papaya");
        fruits.add("orange");
        System.out.println(fruits);

        //size
        System.out.println(fruits.size());

        //contains
        System.out.println(fruits.contains("guava"));

        //toArray
        String fruitcopy[] = new String[fruits.size()];
        fruits.toArray(fruitcopy);
        for(String e : fruitcopy){
            System.out.print(e+" ");
        }

        //remove
        fruits.remove("apple");
        fruits.remove(2);
        System.out.println(fruits);

        //remove all
        ArrayList<String> toRemove = new ArrayList<String>();
        toRemove.add("kiwi");
        toRemove.add("orange");
        fruits.removeAll(toRemove);
        System.out.println(fruits);

        //clear
        fruits.clear();
        System.out.println(fruits);

        //is empty
        System.out.println(fruits.isEmpty());


    }
}
