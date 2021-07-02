package Greedy;
import java.util.*;

class node implements Comparable<node>{
    int freq;
    char ch;
    node left, right;
    node(char c, int f){
        freq = f;
        ch = c;
    }
    public int compareTo(node o){
        return this.freq - o.freq;
    }
}

public class Huffman_Coding{
    node build_tree(int[] f, char[] c){
        PriorityQueue<node> pq = new PriorityQueue<>();
        for(int i=0; i<f.length; i++){
            pq.add(new node(c[i], f[i]));
        }
        while(pq.size()>1){
            node left = pq.poll();
            node right = pq.poll();
            node nn = new node('$', left.freq+right.freq);
            nn.left = left;
            nn.right = right;
            pq.add(nn);
        }
        return pq.peek();
    }
    
    void printing(node nn, String s){
        if(nn==null) return;
        if(nn.ch != '$'){
            System.out.println(nn.ch+"--->"+s);
        }
        printing(nn.left, s+"0");
        printing(nn.right, s+"1");
    }
    
    void algo(int[] f, char[] c){
        node root = build_tree(f, c);
        printing(root,"");
    }
}
class cc{
    public static void main(String args[]){
        Huffman_Coding h = new Huffman_Coding();
        int[] f = {10, 50, 20, 40, 80};
        char[] c = {'a', 'd', 'b', 'e', 'f'};
        h.algo(f,c);
    }
}