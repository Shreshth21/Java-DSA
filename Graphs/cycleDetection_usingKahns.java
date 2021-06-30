package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cycleDetection_usingKahns{
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    
    boolean algo(ArrayList<ArrayList<Integer>> adj, int v){
        int count = 0;
        int[] indegree = new int[v];
        for(ArrayList<Integer> x : adj){
            for(int y : x){
                indegree[y]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < v; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int temp = q.poll();
            count++;
            //System.out.print(temp+" ");
            for(int x : adj.get(temp)){
                indegree[x]--;
                if(indegree[x]==0){
                    q.add(x);
                }
            }
        }
        return !(count==v);
    }
}

class xy{
    public static void main(String[] args){
        cycleDetection_usingKahns k = new cycleDetection_usingKahns();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        k.addEdge(adj, 0, 2);
        k.addEdge(adj, 3, 0);
        k.addEdge(adj, 1, 3);
        k.addEdge(adj, 1, 4);
        k.addEdge(adj, 2, 3);
        
        
        System.out.println(k.algo(adj, v));
    }
}