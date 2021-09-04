package DataStructures;

public class Arraylist{
    public static void main(String[] args){
        
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();
        java.util.ArrayList<String> newfruits = new java.util.ArrayList<>();
        //add
        fruits.add("apple");
        fruits.add("banana");
        fruits.add(1, "orange");
        System.out.println(fruits.get(1));
        newfruits.addAll(fruits);
        System.out.println("new"+newfruits);
        
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
        java.util.ArrayList<String> toRemove = new java.util.ArrayList<String>();
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


/*
ArrayList methods:
list.add()
list.remove(index)
list.remove(Integer.valueOf(30))
list.clear()
list.contains()
list.isEmpty()
list.set(index, data)
list.size()
list.toArray(arr)
newlist.addAll(list)

iterator:
Iterator<Integer> it = list.iterator();
while(it.hasNext()){
    sysout(it.next());
}

*/

