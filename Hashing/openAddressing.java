package Hashing;

public class openAddressing{
    int[] arr;
    int cap, size;
    
    openAddressing(int x){
        cap = x;
        arr = new int[cap];
        for(int i = 0; i < cap; i++) arr[i] = -1;
        size = 0;
    }
    
    int hash(int x){
        return x%cap;
    }
    
    boolean search(int x){
        int h = hash(x);
        int i = h;
        while(arr[i]!=-1){
            if(arr[i]==x){
                return true;
            }
            i = (i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
    }
    
    void insert(int x){
        int h = hash(x);
        if(size==cap){
            return;
        }
        int i = h;
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=x){
            i = (i+1)%cap;
        }
        if(arr[i]==-1 || arr[i]==-2){
            size++;
            arr[i] = x;
            return;
        }
    }
    
    boolean remove(int x){
        int h = hash(x);
        int i = h;
        while(arr[i]!=-1){
            if(arr[i]==x){
                arr[i] = -2;
                size--;
                return true;
            }
            i = (i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
        
    }
}

class hilo{
    public static void main(String args[]){
        openAddressing h = new openAddressing(5);
        h.insert(5);
        h.insert(10);
        h.search(5);
        h.remove(10);
        
    }
}