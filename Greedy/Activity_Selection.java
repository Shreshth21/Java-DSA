package Greedy;
import java.util.*;

class pair implements Comparable<pair>{
    int start;
    int end;
    pair(int start, int end){
        this.start = start;
        this.end = end;
    }
    public int compareTo(pair p){
        return this.end - p.end;
    }
}

public class Activity_Selection{
    static int solution(pair[] arr){
        Arrays.sort(arr);
        int res = 1;
        int pos = 0;
        System.out.println("("+arr[0].start+", "+arr[0].end+")");
        for(int i=1; i<arr.length; i++){
            if(arr[i].start >= arr[pos].end){
                res++;
                pos = i;
                System.out.println("("+arr[i].start+", "+arr[i].end+")");
            }
        }
        return res;
    }
    
    public static void main(String args[]){
        pair[] arr = {new pair(2,3), new pair(1,4), new pair(5,8), new pair(6,10)};
        System.out.println(solution(arr));
        
    }
}
