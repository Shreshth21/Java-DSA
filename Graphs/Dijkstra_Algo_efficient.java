package Graphs;
import java.util.*;

public class Dijkstra_Algo_efficient{
    void addEdge(ArrayList<ArrayList<node>> adj, int u, int v, int wt){
        adj.get(u).add(new node(u,v,wt));
        adj.get(v).add(new node(v,u,wt));
    }
    
    void dijkstra(ArrayList<ArrayList<node>> adj, int v){
        boolean visited[] = new boolean[v];
        PriorityQueue<node> pq = new PriorityQueue<>();
        pq.add(new node(-1,0,0));
        
        while(!pq.isEmpty()){
            node temp = pq.poll();
            if(visited[temp.ver]){
                continue;
            }
            visited[temp.ver] = true;
            
            System.out.println(temp.ver+"--->"+temp.wt);
            for(node x: adj.get(temp.ver)){
                if(!visited[x.ver]){
                    pq.add(new node(temp.ver, x.ver, temp.wt+x.wt));
                }
            }
        }
    }
}
class cx{
    public static void main(String[] args){
        Dijkstra_Algo_efficient p = new Dijkstra_Algo_efficient();
        int v = 4;
        ArrayList<ArrayList<node>> adj = new ArrayList<>();
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<node>());
        }
        p.addEdge(adj, 0, 1, 5);
        p.addEdge(adj, 0, 2, 8);
        p.addEdge(adj, 1, 2, 10);
        p.addEdge(adj, 1, 3, 15);
        p.addEdge(adj, 2, 3, 20);
    
        p.dijkstra(adj,v);
    }
}
