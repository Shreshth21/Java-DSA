package Graphs;

import java.util.ArrayList;

public class cycle_detection_directed_graph{
    
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    
    boolean DFS(int s, ArrayList<ArrayList<Integer>> adj, boolean visited[], boolean recSt[]){
        visited[s] = true;
        recSt[s] = true;
        
        for(int x : adj.get(s)){
            if(!visited[x]){
                if(DFS(x, adj, visited, recSt)){
                    return true;
                }
            }else if(recSt[x]){
                return true;
            }
        }
        recSt[s] = false;
        return false;
    }
    
    boolean detectCycle(ArrayList<ArrayList<Integer>> adj, int v){
        boolean visited[] = new boolean[v];
        boolean recSt[] = new boolean[v];
        
        for(int i=0; i<v; i++){
            if(!visited[i]){
                if(DFS(i, adj,visited,recSt)){
                    return true;
                }
            }
        }
        return false;
    }
}

class fucku{
    public static void main(String[] args){
        int vertices = 6;
        cycle_detection_directed_graph c = new cycle_detection_directed_graph();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < vertices; i++){
            adj.add(new ArrayList<Integer>());
        }
        c.addEdge(adj, 0, 1);
        c.addEdge(adj, 2, 1);
        c.addEdge(adj, 2, 3);
        c.addEdge(adj, 3, 4);
        c.addEdge(adj, 4, 5);
        c.addEdge(adj, 5, 1);
        System.out.println(c.detectCycle(adj, vertices));
    }
}