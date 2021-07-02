package Graphs;
import java.util.*;

public class Tarjans_Algo{

    int time = 0;
    
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    
    void tarjan(ArrayList<ArrayList<Integer>> adj, int v){
        boolean[] visited = new boolean[v];
        boolean[] stackMember = new boolean[v];
        int[] low = new int[v];
        int [] discTime = new int[v];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<v; i++){
            if(!visited[i]){
                DFS(i, low, discTime, stackMember, st, adj, visited);
            }
        }
        
    }
    
    void DFS(int currVer, int[] low, int[] discTime, boolean[] stackMember, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[currVer] = true;
        discTime[currVer] = low[currVer] = time++;
        stackMember[currVer] = true;
        st.push(currVer);
        
        for(int x : adj.get(currVer)){
            if(!visited[x]){
                DFS(x, low, discTime, stackMember, st, adj, visited);
                low[currVer] = Math.min(low[currVer], low[x]);
            }
            else if(stackMember[x]){
                low[currVer] = Math.min(low[currVer], discTime[x]);
            }
        }
        
        int temp = -1;
        if(low[currVer] == discTime[currVer]){
            while(temp != currVer){
                temp = st.pop();
                System.out.print(temp+", ");
                stackMember[temp] = false;
            }
            System.out.println();
        }
    }
    
}

class dd{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 8;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        Tarjans_Algo t = new Tarjans_Algo();
        t.addEdge(adj, 0, 1);
        t.addEdge(adj, 1, 2);
        t.addEdge(adj, 2, 0);
        t.addEdge(adj, 2, 3);
        t.addEdge(adj, 3, 4);
        t.addEdge(adj, 4, 5);
        t.addEdge(adj, 4, 7);
        t.addEdge(adj, 5, 6);
        t.addEdge(adj, 6, 7);
        t.addEdge(adj, 6, 4);
        
        t.tarjan(adj, v);
    }
}