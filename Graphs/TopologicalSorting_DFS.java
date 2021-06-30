package Graphs;
import java.util.*;

public class TopologicalSorting_DFS{
    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    void DFS(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[], Stack<Integer> st){
        visited[s] = true;
        for(int x:adj.get(s)){
            if(!visited[x]){
                DFS(adj,x,visited,st);
            }
        }
        st.push(s);
    }
    void sorting(ArrayList<ArrayList<Integer>> adj, int v){
        Stack<Integer> st = new Stack<>();
        boolean visited[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(!visited[i]){
                DFS(adj, i, visited, st);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    
}
class no{
    public static void main(String[] args){
        int v = 5;
        TopologicalSorting_DFS m = new TopologicalSorting_DFS();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        m.addEdge(adj,0,1);
        m.addEdge(adj,1,3);
        m.addEdge(adj,2,3);
        m.addEdge(adj,2,4);
        m.addEdge(adj,3,4);
        m.sorting(adj,v);
    }
}
