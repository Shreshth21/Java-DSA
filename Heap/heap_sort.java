package Heap;

public class heap_sort{
    int arr[];
    int size, cap;
    
    heap_sort(int x){
        cap = x;
        size = 0;
        arr = new int[cap];
    }
    
    void swap(int a, int b){
        int x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
    }
    
    void display(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    void maxHeapify(int index, int a[], int n){
        arr = a;
        int l = 2*index+1;
        int r = 2*index+2;
        int max = index;
        if(l<n && arr[l]>arr[max]) max = l;
        if(r<n && arr[r]>arr[max]) max = r;
        if(max!=index){
            swap(max,index);
            maxHeapify(max, arr, n);
        }
    }
    
    
    void build_heap(int[] a){
        arr = a;
        size = a.length;
        for(int i = (size-2)/2; i>=0; i--){
            maxHeapify(i, arr, size);
        }
    }
    
    void heapSort(int[] a){
        arr = a;
        build_heap(arr);
        int x = size;
        for(int i=size-1; i>0; i--){
            swap(0,i);
            maxHeapify(0,arr,i);
        }
    }
}
class clair{
    public static void main(String[] args){
        heap_sort m = new heap_sort(100);
        m.heapSort(new int[]{1, 5, 6, 85, 14, 232, 45, 18});
        m.display();
    }
}