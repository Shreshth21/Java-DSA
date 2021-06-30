package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

class node implements Comparable<node>{
    int ver;
    int parent;
    int wt;
    
    node(int parent, int ver, int wt){
        this.ver = ver;
        this.wt = wt;
        this.parent = parent;
    }
    
    public int compareTo(node o){
        return (this.wt-o.wt);
    }
}

public class Prims_Algo_efficient{
    
    void addEdge(ArrayList<ArrayList<node>> adj, int u, int v, int wt){
        adj.get(u).add(new node(u, v, wt));
        adj.get(v).add(new node(v, u, wt));
    }
    
    int prims(ArrayList<ArrayList<node>> adj, int v){
        PriorityQueue<node> pq = new PriorityQueue<>();
        pq.add(new node(-1, 0, 0));
        boolean setMST[] = new boolean[v];
        int res = 0;
        
        while(!pq.isEmpty()){
            node temp = pq.poll();
            if(setMST[temp.ver]){
                continue;
            }
            setMST[temp.ver] = true;
            res = res+temp.wt;
            if(temp.parent!=-1){
                System.out.println(temp.parent+"--->"+temp.ver+" @ "+temp.wt);
            }
            
            for(node x : adj.get(temp.ver)){
                if(!setMST[x.ver]){
                    pq.add(new node(temp.ver, x.ver, x.wt));
                }
            }
        }
        
        return res;
    }
    
}

class xxx{
    public static void main(String args[]){
        Prims_Algo_efficient p = new Prims_Algo_efficient();
        int v = 5;
        ArrayList<ArrayList<node>> adj = new ArrayList<ArrayList<node>>();
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<node>());
        }
        p.addEdge(adj, 0, 1, 5);
        p.addEdge(adj, 0, 2, 8);
        p.addEdge(adj, 1, 2, 10);
        p.addEdge(adj, 1, 3, 15);
        p.addEdge(adj, 2, 3, 20);
        
        System.out.println(p.prims(adj, v));
    }
}
