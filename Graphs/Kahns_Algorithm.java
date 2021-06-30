package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Kahns_Algorithm{
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    
    void algo(ArrayList<ArrayList<Integer>> adj, int v){
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
            System.out.print(temp+" ");
            for(int x : adj.get(temp)){
                indegree[x]--;
                if(indegree[x]==0){
                    q.add(x);
                }
            }
        }
    }
}

class xyz{
    public static void main(String[] args){
        Kahns_Algorithm k = new Kahns_Algorithm();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        k.addEdge(adj, 0, 2);
        k.addEdge(adj, 0, 3);
        k.addEdge(adj, 1, 3);
        k.addEdge(adj, 1, 4);
        k.addEdge(adj, 2, 3);
        
        k.algo(adj, v);
    }
}