package Graphs;
import java.util.*;

public class Articulation_Point{
    int time = 0;
    
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    void DFS(int currVer, ArrayList<ArrayList<Integer>> adj, int[] parent, boolean[] visited, int[] low, int[] discTime, boolean[] isAP){
        int children = 0;
        visited[currVer] = true;
        discTime[currVer] = low[currVer] = time++;
        for(int x: adj.get(currVer)){
            if(!visited[x]){
                children++;
                parent[x] = currVer;
                DFS(x, adj, parent, visited, low, discTime, isAP);
                low[currVer] = Math.min(low[currVer], low[x]);
                
                //rule-1
                if(parent[currVer] == -1 && children > 1){
                    isAP[currVer] = true;
                }
                
                //rule-2
                if(parent[currVer]!=-1 && low[x] >= discTime[currVer]){
                    isAP[currVer] = true;
                }
            }
            //back edges
            else if(x != parent[currVer]){
                low[currVer] = Math.min(low[currVer], discTime[x]);
            }
        }
    }
    
    void algo(ArrayList<ArrayList<Integer>> adj, int v){
        //variables prepared
        int[] parent = new int[v];
        boolean[] visited = new boolean[v];
        int[] low = new int[v];
        int[] discTime = new int[v];
        boolean isAP[] = new boolean[v];
        for(int i=0; i<v; i++){
            parent[i] = -1;
        }
        
        //main algo start
        for(int i=0; i<v; i++){
            if(!visited[i]){
                DFS(i, adj, parent, visited, low, discTime, isAP);
            }
        }
        
        
        //printing AP
        boolean flag = false;
        for(int i=0; i<v; i++){
            if(isAP[i]){
                flag = true;
                System.out.println(i);
            }
        }
        if(!flag){
            System.out.println("No Articulation Point in this graph");
        }
    }
    
}

class vc{
    public static void main(String args[]){
        Articulation_Point a = new Articulation_Point();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 6;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        a.addEdge(adj,1,0);
        a.addEdge(adj,0,5);
        a.addEdge(adj,1,3);
        a.addEdge(adj,1,2);
        a.addEdge(adj,2,3);
        a.addEdge(adj,2,4);
        a.addEdge(adj,3,4);
        a.addEdge(adj,1,5);
        a.addEdge(adj,0,4);
        
        a.algo(adj, v);
        
    }
}