package Graphs;

public class Prims_Algo_naive{
    
    void addEdge(int[][]graph, int i, int j, int wt){
        graph[i][j] = wt;
        graph[j][i] = wt;
    }
    int mst(int[][] graph, int v){
        int[] parent = new int[v];
        parent[0] = -1;
        boolean[] setMST = new boolean[v];
        int res = 0;
        int[] dist = new int[v];
        for(int i=1; i<v; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        
        
        for(int i=0; i<v; i++){
            int min = -1;
            for(int j=0; j<v; j++){
                if(!setMST[j] && (min==-1||dist[j]<dist[min])){
                    min = j;
                }
            }
            
            setMST[min] = true;
            res += dist[min];
            System.out.println("weight ="+dist[min]);
            for(int j=0; j<v; j++){
                if(graph[i][j]!=0 && !setMST[j]){
                    if(dist[j]>graph[min][j]){
                        dist[j]=graph[min][j];
                        parent[j] = min;
                    }
                }
            }
        }
        for(int i=1; i<v; i++){
            System.out.println(i+" "+parent[i]);
        }
        return res;
    }
    
}
class xb{
    public static void main(String args[]){
        Prims_Algo_naive p = new Prims_Algo_naive();
        int v = 4;
//        int[][] graph={ { 0, 2, 0, 6, 0 },
//                { 2, 0, 3, 8, 5 },
//                { 0, 3, 0, 0, 7 },
//                { 6, 8, 0, 0, 9 },
//                { 0, 5, 7, 9, 0 } };
        int[][] graph = new int[v][v];
        p.addEdge(graph,0,1,5);
        p.addEdge(graph,0,2,8);
        p.addEdge(graph,1,2,10);
        p.addEdge(graph,1,3,15);
        p.addEdge(graph,2,3,20);
        System.out.println(p.mst(graph, v));
        int[] b = new int[3];
    }
}
