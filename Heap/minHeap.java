package Heap;

public class minHeap{
    int[] arr;
    int size, cap;
    
    minHeap(int x){
        cap = x;
        arr = new int[x];
        size = 0;
    }
    
    int left(int x){
        return (2*x+1);
    }
    
    int right(int x){
        return (2*x+2);
    }
    
    int parent(int x){
        return ((x-1)/2);
    }
    
    void swap(int a, int b){
        int x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
    }
    
    void insert(int x){
        if(size==cap){
            return;
        }
        arr[size++] = x;
        int i = size-1;
        while(parent(i) >= 0 && arr[i] < arr[parent(i)]){
            swap(parent(i), i);
        }
    }
    
    void display(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    void heapify(int i){
        int l = left(i);
        int r = right(i);
        int min = i;
        if(l < size && arr[l] < arr[min]){
            min = l;
        }
        if(r < size && arr[r] < arr[min]){
            min = r;
        }
        if(min!=i){
            swap(i, min);
            heapify(min);
        }
    }
    
    int extractMin(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            size--;
            return arr[0];
        }
        swap(0, size-1);
        size--;
        heapify(0);
        return arr[size];
    }
    
    void buildHeap(int[] a){
        arr = a;
        size = arr.length;
        for(int i = parent(size-1); i >= 0; i--){
            heapify(i);
        }
    }
    
    int delete(int index){
        swap(index, size-1);
        size--;
        heapify(index);
        return arr[size];
    }
    
}


class claint{
    public static void main(String[] args){
        minHeap m = new minHeap(100);
        m.insert(2);
        m.insert(1);
        m.insert(5);
        m.insert(10);
        m.insert(15);
        m.insert(3);
        m.insert(25);
        m.display();
        m.delete(1);
        m.display();
        m.buildHeap(new int[]{10,2,856,85,452,6,5,41,12,58,155,69});
        m.display();
        
    }
}