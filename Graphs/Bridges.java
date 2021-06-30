package Graphs;
import java.util.*;

public class Bridges{
    int time=0;
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    void DFS(int currVer, int[] parent, int[] discTime, int[] low, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        
        visited[currVer] = true;
        discTime[currVer] = low[currVer] = time++;
        
        for(int x : adj.get(currVer)){
            if(!visited[x]){
                parent[x] = currVer;
                DFS(x, parent, discTime, low, visited, adj);
                low[currVer] = Math.min(low[currVer], low[x]);
                
                if(low[x] > discTime[currVer]){
                    System.out.println(currVer+"---"+x);
                }
                
            }
            else if(x != parent[currVer]){
                low[currVer] = Math.min(low[currVer], discTime[x]);
            }
        }
    }
    
    void algo(ArrayList<ArrayList<Integer>> adj, int v){
        int[] parent = new int[v];
        boolean[] visited = new boolean[v];
        int[] discTime = new int[v];
        int[] low = new int[v];
        Arrays.fill(parent, -1);
        
        for(int i=0; i<v; i++){
            if(!visited[i]){
                DFS(i, parent, discTime, low, visited, adj);
            }
        }
        
    }
}

class kk{
    public static void main(String[] args){
        Bridges b = new Bridges();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        b.addEdge(adj, 0, 1);
        b.addEdge(adj, 0, 2);
        b.addEdge(adj, 2, 1);
        b.addEdge(adj, 2, 3);
        b.addEdge(adj, 3, 4);
        
        b.algo(adj, v);
    }
}