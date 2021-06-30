package Graphs;

import java.util.*;

class pair{
    int v;
    int w;
    
    pair(int v, int w){
        this.v = v;
        this.w = w;
    }
}

public class Shortest_path_DAG{
    void addEdge(ArrayList<ArrayList<pair>> adj, int u, int v, int w){
        adj.get(u).add(new pair(v,w));
    }
    
    void topology(ArrayList<ArrayList<pair>> adj, int s, int v){
        int[] dist = new int[v];
        for(int i=0; i<v; i++){
            dist[i] = Integer.MAX_VALUE - 100;
        }
        dist[s] = 0;
        int[] indegree = new int[v];
        for(ArrayList<pair> x:adj){
            for(pair y : x){
                indegree[y.v]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<v; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
            ///////////////
            for(pair y : adj.get(x)){
                if(dist[y.v]>dist[x]+y.w){
                    dist[y.v]=dist[x]+y.w;
                }
            }
            ///////////////
            for(pair z :adj.get(x)){
                indegree[z.v]--;
                if(indegree[z.v]==0){
                    q.add(z.v);
                }
            }
        }
        for(int i:dist){
            System.out.print(i+" ");
        }
    }
}

class bye{
    public static void main(String[] args){
        Shortest_path_DAG m = new Shortest_path_DAG();
        ArrayList<ArrayList<pair>> adj = new ArrayList<ArrayList<pair>>();
        int v = 6;
        int s = 0;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<pair>());
        }
        m.addEdge(adj,0,1,2);
        m.addEdge(adj,0,4,1);
        m.addEdge(adj,1,2,3);
        m.addEdge(adj,4,2,2);
        m.addEdge(adj,2,3,6);
        m.addEdge(adj,4,5,4);
        m.addEdge(adj,5,3,1);
        
        m.topology(adj,s,v);
    }
}