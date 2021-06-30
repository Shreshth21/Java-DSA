package Graphs;
import java.util.*;

public class KosaRaju{
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    
    void dfs(int x, boolean visited[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        visited[x] = true;
        for(int y: adj.get(x)){
            if(!visited[y]){
                dfs(y, visited, adj, st);
            }
        }
        st.push(x);
    }
    void dfsRet(int x, ArrayList<ArrayList<Integer>> transpose, boolean[] visited){
        for(int y: transpose.get(x)){
            if(!visited[y]){
                System.out.print(y+" ");
                visited[y] = true;
                dfsRet(y, transpose, visited);
            }
        }
    }
    
    void algo(ArrayList<ArrayList<Integer>> adj, int v){
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[v];
        
        
        //step-1
        for(int i=0; i<v; i++){
            if(!visited[i]){
                dfs(i, visited, adj, st);
            }
        }
        
        //step-2
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int i=0; i<v; i++){
            transpose.add(new ArrayList<Integer>());
        }
        for(int i=0; i<v; i++){
            for(int x : adj.get(i)){
                transpose.get(x).add(i);
            }
        }
        
        //step-3
        visited = new boolean[v];
        while(!st.isEmpty()){
            int temp = st.pop();
            if(visited[temp]){
                continue;
            }
            visited[temp] = true;
            System.out.print(temp+" ");
            dfsRet(temp, transpose, visited);
            System.out.println();
        }
    }
}

class cc{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 8;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        KosaRaju k = new KosaRaju();
        k.addEdge(adj, 0, 1);
        k.addEdge(adj, 1, 2);
        k.addEdge(adj, 2, 0);
        k.addEdge(adj, 2, 3);
        k.addEdge(adj, 3, 4);
        k.addEdge(adj, 4, 5);
        k.addEdge(adj, 5, 6);
        k.addEdge(adj, 6, 7);
        k.addEdge(adj, 4, 7);
        k.addEdge(adj, 6, 4);
        
        k.algo(adj, v);
    }
}