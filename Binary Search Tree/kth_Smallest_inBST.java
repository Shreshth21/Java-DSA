package BinarySearchTree;

public class kth_Smallest_inBST{
    static class node{
        int data;
        node left;
        node right;
        int lcount;
        node(int x){
            data = x;
        }
    }

    public static node insert(node nn, int x)
    {
        if (nn == null)
            return new node(x);

        if (x < nn.data) {
            nn.left = insert(nn.left, x);
            nn.lcount++;
        }

        else if (x > nn.data)
            nn.right = insert(nn.right, x);
        return nn;
    }

    static node smallest(node nn, int k){
        if(nn==null) return null;
        int count = nn.lcount+1;
        if(count==k) return nn;
        if(count<k) return smallest(nn.left, k);
        return smallest(nn.right, k-count);
    }

    public static void main(String[] args){
        kth_Smallest_inBST a = new kth_Smallest_inBST();
        int k = 3;
        node nn = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };

        for (int x : keys)
            nn = insert(nn, x);

        node res = a.smallest(nn, k);
        if (res == null)
            System.out.println("There are less "
                    + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.data);
    }
}