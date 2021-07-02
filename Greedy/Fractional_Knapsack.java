package Greedy;
import java.util.*;

class duo {
    int weight;
    int value;
    duo(int wt, int value){
        this.weight = wt;
        this.value = value;
    }
}

class duo_implement implements Comparator<duo>{
    public int compare(duo o1, duo o2){
        return (o2.value/o2.weight)-(o1.value/o1.weight);
    }
}

public class Fractional_Knapsack{
    static int knapsack(duo[] arr, int cap){
        Arrays.sort(arr,new duo_implement());
        int pos = 0;
        int res = 0;
        while(cap>0 && pos<arr.length){
            if(cap >= arr[pos].weight){
                res += arr[pos].value;
                cap -= arr[pos].weight;
                System.out.println(arr[pos].weight+", "+arr[pos].value);
                pos++;
                
            }
            else{
                res += arr[pos].value*cap/arr[pos].weight;
                System.out.println(arr[pos].weight+", "+arr[pos].value);
                cap = 0;
                pos++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        duo[] arr = {new duo(50,600), new duo(30,400), new duo(20,500)};
        int cap = 70;
        System.out.println(knapsack(arr, cap));
    }
}
