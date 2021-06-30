package Graphs;
import java.util.*;

public class Tarjans_Algo{

    int time = 0;
    
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    void tarjan(ArrayList<ArrayList<Integer>> adj, int v){
        int[] parent = new int[v];
        boolean[] visited = new boolean[v];
        int[] low = new int[v];
        int [] discTime = new int[v];
        Arrays.fill(parent, -1);
        
        
    }
    
}

class dd{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        Tarjans_Algo t = new Tarjans_Algo();
        t.addEdge(adj, 0, 1);
        t.addEdge(adj, 0, 2);
        t.addEdge(adj, 2, 1);
        t.addEdge(adj, 0, 3);
        t.addEdge(adj, 3, 4);
        
        t.tarjan();
    }
}