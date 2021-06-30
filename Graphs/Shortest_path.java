package Graphs;

import java.util.*;

public class Shortest_path{
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void print(ArrayList<ArrayList<Integer>> adj){
        for(int i=0; i<adj.size(); i++){
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    
    void shortest_path(ArrayList<ArrayList<Integer>> adj, int s, int v){
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[v];
        int[] res = new int[v];
        Arrays.fill(res,-1);
        q.add(s);
        visited[s] = true;
        res[s] = 0;
        int dist = 0;
        while(!q.isEmpty()){
            int temp = q.poll();
            dist++;
            for(int x: adj.get(temp)){
                if(!visited[x]){
                    res[x] = dist;
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

