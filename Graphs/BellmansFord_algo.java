package Graphs;
import java.util.*;

class Node1{
    int u, v, wt;
    Node1(int u, int v, int wt){
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}

public class BellmansFord_algo{
    void algo(ArrayList<Node1> edge, int v){
        int dist[] = new int[v];
        for(int i=1; i<v; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        
        for(int i=0; i<v-1; i++){
            for(Node1 x : edge){
                //relaxation
                if(dist[x.u]+x.wt < dist[x.v]){
                    dist[x.v] = dist[x.u] + x.wt;
                }
            }
        }
        boolean flag = false;
        for(Node1 x : edge){
            if(dist[x.u]+x.wt < dist[x.v]){
                flag = true;
                System.out.println("Negative cycle detected");
                break;
            }
        }
        if(!flag){
            for(int i=0; i<v; i++){
                System.out.println(i+"--->"+dist[i]);
            }
        }
    }
}

class vx{
    public static void main(String[] args){
        int v = 4;
        ArrayList<Node1> edge = new ArrayList<>();
        edge.add(new Node1(0,1,1));
        edge.add(new Node1(0,2,4));
        edge.add(new Node1(1,2,-3));
        edge.add(new Node1(1,3,2));
        edge.add(new Node1(2,3,3));
//        edge.add(new Node1(3,4, -2));
//        edge.add(new Node1(2,4, 3));
        
        
        
        BellmansFord_algo b = new BellmansFord_algo();
        b.algo(edge, v);
    }
}
