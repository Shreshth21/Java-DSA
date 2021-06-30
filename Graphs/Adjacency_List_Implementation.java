package Graphs;

import java.util.*;

public class Adjacency_List_Implementation{
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
    
    void BFS(ArrayList<ArrayList<Integer>> adj, int v, int s, boolean visited[]){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp+" ");
            for(int x: adj.get(temp)){
                if(!visited[x]){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        System.out.println();
    }
    
    int BFS_dis(ArrayList<ArrayList<Integer>> adj, int v){
        int count = 0;
        boolean visited[] = new boolean[v];
        for(int i =0; i<v; i++){
            if(!visited[i]){
                BFS(adj,v,i,visited);
                count++;
            }
        }
        return count;
    }
    
    void DFS(ArrayList<ArrayList<Integer>> adj, int v, int s, boolean visited[]){
        System.out.print(s+" ");
        visited[s] = true;
        for(int x : adj.get(s)){
            if(!visited[x])
                DFS(adj, v, x, visited);
        }
    }
    
    int DFS_complete(ArrayList<ArrayList<Integer>> adj, int v){
        int count =0;
        boolean visited[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(!visited[i]){
                DFS(adj,v,i,visited);
                count++;
            }
        }
        System.out.println();
        return count;
    }
}


class klient{
    public static void main(String args[]){
        Adjacency_List_Implementation m = new Adjacency_List_Implementation();
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        m.addEdge(adj,0,1);
        m.addEdge(adj,0,2);
        m.addEdge(adj,1,2);
        m.addEdge(adj,3,4);
        //m.print(adj);
        m.BFS(adj,v,0, new boolean[v]);
        //m.BFS_dis(adj,v);
        
        m.DFS_complete(adj,v);
        m.DFS(adj,v,0,new boolean[v]);
    }
}
