package BinarySearchTree;

public class BST{
    
    class node{
        int data;
        node left;
        node right;
        
        node(int x){
            data = x;
        }
    }
    node root;
    
    
    //----------------------------------------------------------------------------------------------------
    
    
    BST(int[] arr){
        root = construct(arr, 0, arr.length-1);
    }
    
    node construct(int[] arr, int lo, int hi){
    
        if(lo>hi) return null;
        
        int mid = (lo+hi)/2;
        
        node nn = new node(arr[mid]);
        nn.left = construct(arr,lo,mid-1);
        nn.right = construct(arr,mid+1, hi);
        
        return nn;
    }
    
    
    //----------------------------------------------------------------------------------------------------
    
    
    boolean search(int x){
        return search(x,root);
    }
    boolean search(int x, node nn){
        if(nn==null) return false;
        
        if(nn.data == x) return true;
        if(x > nn.data) return search(x,nn.right);
        else return search(x,nn.left);
    }
    
    
    //----------------------------------------------------------------------------------------------------
    
    
    void insert(int x){
        insert(root,x);
    }
    
    node insert(node nn, int x){
        if(nn == null) return new node(x);
        if(nn.data>x)
            nn.left = insert(nn.left,x);
        else
            nn.right = insert(nn.right,x);
        return nn;
    }
    
    
    //----------------------------------------------------------------------------------------------------
    
    
    node insertIterative(int x){
        return insertIterative(root,x);
    }
    
    node insertIterative(node nn, int x){
        node temp = new node(x);
        node parent = null;
        node curr = nn;
        while(curr!=null){
            parent = curr;
            if(curr.data>x) curr = curr.left;
            else if(curr.data<x) curr = curr.right;
            else return nn;
        }
        if(nn==null) return temp;
        if(parent.data>x) parent.left = temp;
        else parent.right = temp;
        return nn;
    }
    
    
    //----------------------------------------------------------------------------------------------------
    
    node delete(int x){
        return delete(x,root);
    }
    node delete(int x, node nn){
        if(nn == null) return null;
        
        if(nn.data>x) root.left = delete(x,nn.left);
        else if(nn.data<x) root.right = delete(x,nn.right);
        else{
            if(nn.left == null) return nn.right;
            else if (nn.right == null) return nn.left;
            else{
                node succ = successor(nn);
                nn.data = succ.data;
                nn.right =  delete(succ.data, nn.right);
            }
        }
        return root;
    }
    
    node successor(node nn){
        node curr = nn.right;
        while(curr!=null) curr = curr.left;
        return curr;
    }
    //----------------------------------------------------------------------------------------------------
    
    node floor(int x){
        return floor(root,x);
    }
    node floor(node nn, int x){
        node curr = nn;
        node res = null;
        while(curr!=null){
            if(curr.data == x) return curr;
            else if(curr.data>x) curr = curr.left;
            else {
                res = curr;
                curr = curr.right;
            }
        }
        return res;
    }
    
    
    //----------------------------------------------------------------------------------------------------
    
    node ceil(int x){
        return ceil(root,x);
    }
    node ceil(node nn, int x){
        node curr = nn;
        node res = null;
        while(curr!=null){
            if(curr.data == x) return curr;
            else if(curr.data>x){
                res = curr;
                curr = curr.left;
            }
            else curr = curr.right;
            
        }
        return res;
    }
    
    
    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------
}

//class client{
//    public static void main(String[] args){
//        BST bst = new BST(new int[]{20,30,40,50,55,60,65,70});
//        bst.insert(55);
//        bst.insertIterative(70);
//        System.out.println(bst.search(70));
//        //bst.delete(70);
//        System.out.println(bst.search(70));
//        System.out.println(bst.floor(42).data);
//        System.out.println(bst.ceil(63).data);
//    }
//}
