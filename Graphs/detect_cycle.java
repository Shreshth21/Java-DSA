package Graphs;

import java.util.ArrayList;

public class detect_cycle{
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    void print(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < adj.size(); i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    
    boolean DFS(ArrayList<ArrayList<Integer>> adj, int v, int s, boolean[] visited, int parent){
        visited[s] = true;
        for(int x : adj.get(s)){
            if(!visited[x]){
                if(DFS(adj, v, x, visited, s)){
                    return true;
                }
            }else if(x!=parent){
                return true;
            }
        }
        return false;
    }
    
    boolean cycleDetection(ArrayList<ArrayList<Integer>> adj, int v){
        boolean[] visited = new boolean[v];
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                if(DFS(adj, v, i, visited, -1)){
                    return true;
                }
            }
        }
        return false;
    }
}

class klet{
    public static void main(String args[]){
        detect_cycle m = new detect_cycle();
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        m.addEdge(adj, 0, 1);
        m.addEdge(adj, 1, 2);
        m.addEdge(adj, 1, 3);
        //m.addEdge(adj, 2, 3);
        m.addEdge(adj, 2, 4);
        System.out.println(m.cycleDetection(adj, v));
    }
}
