package Greedy;
import java.util.*;

class job{
    int deadline, profit;
    job(int deadline, int profit){
        this.deadline = deadline;
        this.profit = profit;
    }
}
class deadline implements Comparator<job>{
    public int compare(job o1, job o2){
        return o2.deadline-o1.deadline;
    }
}
class profit implements Comparator<job>{
    public int compare(job o1, job o2){
        return o2.profit - o1.profit;
    }
}
public class Job_sequencing{
    public static void main(String args[]){
        int[] d = {5,4,1,5,1};
        int[] v = {80,50,20,10,5};
        job[] arr = new job[d.length];
        for(int i=0; i<d.length; i++){
            arr[i] = new job(d[i], v[i]);
        }
        Arrays.sort(arr, new deadline());
        int m = arr[0].deadline;
        Arrays.sort(arr, new profit());
        boolean[] visited = new boolean[m];
        int[] res = new int[m];
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int dead = arr[i].deadline-1;
            int value = arr[i].profit;
            if(count == m)
                break;
            if(!visited[dead]){
                res[dead] = value;
                visited[dead] = true;
                count++;
            }else{
                for(int j=dead; j>=0; j--){
                    if(!visited[j]){
                        res[j] = value;
                        visited[j] = true;
                        count++;
                        break;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0; i<m; i++){
            sum += res[i];
            System.out.print(res[i]+", ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
