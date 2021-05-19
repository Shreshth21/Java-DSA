package BinaryTree;

import java.util.*;

public class BT{
    
    //-----------------------------------------------------------------------------
    private final node root;
    Scanner sc = new Scanner(System.in);
    int maxLevel = 0;
    node prev = null;
    
    //-----------------------------------------------------------------------------
    
    
    private class node{
        int data;
        node left;
        node right;
    }
    
    
    //-----------------------------------------------------------------------------
    
    //constructor
    BT(){
        root = input(null, true);
    }
    
    private node input(node parent, boolean ilc){ //ilc= is left child
        
        if(parent==null){
            System.out.println("enter the data for root node");
        }else{
            if(ilc){
                System.out.println("Enter the data for left child of"+parent.data);
            }else{
                System.out.println("Enter the data for right child of"+parent.data);
            }
        }
        
        int item = sc.nextInt();
        node nn = new node();
        nn.data = item;
        
        System.out.println(nn.data+" has left child?");
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = input(nn, true);
        }
        
        System.out.println(nn.data+" has right child?");
        boolean rlc = sc.nextBoolean();
        if(rlc){
            nn.right = input(nn, false);
        }
        
        return nn;
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void display(){
        display(root);
    }
    
    private void display(node nn){
        String s = "";
        if(nn.left!=null){
            s += nn.left.data+"--->";
        }else{
            s += ".--->";
        }
        
        
        s += nn.data;
        
        
        if(nn.right!=null){
            s += "<---"+nn.right.data;
        }else{
            s += "<---.";
        }
        
        
        System.out.println(s);
        if(nn.left!=null){
            display(nn.left);
        }
        if(nn.right!=null){
            display(nn.right);
        }
        
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void inorder_display(){
        inorder_display(root);
    }
    
    private void inorder_display(node nn){
        if(nn!=null){
            inorder_display(nn.left);
            System.out.print(nn.data+" ");
            inorder_display(nn.right);
        }
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void preorder_display(){
        preorder_display(root);
    }
    
    private void preorder_display(node nn){
        if(nn!=null){
            System.out.print(nn.data+" ");
            preorder_display(nn.left);
            preorder_display(nn.right);
        }
    }
    
    
    //-----------------------------------------------------------------------------
    
    public int height(){
        return height(root);
    }
    
    private int height(node nn){
        
        if(nn==null){
            return -1;
        }
        return Math.max(height(nn.right), height(nn.left))+1;
        
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void nodeAt_k(int k){
        nodeAt_k(root, k, 1);
    }
    
    private void nodeAt_k(node nn, int k, int count){
        if(nn==null){
            return;
        }
        
        if(count==k){
            System.out.print(nn.data+" ");
            return;
        }
        
        nodeAt_k(nn.left, k, count+1);
        nodeAt_k(nn.right, k, count+1);
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void levelOrder(){
        levelOrder(root);
    }
    
    private void levelOrder(node nn){
        Queue<node> q = new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void lineLevelOrder(){
        lineLevelOrder(root);
    }
    
    private void lineLevelOrder(node nn){
        Queue<node> q = new LinkedList<>();
        q.add(nn);
        q.add(null);
        while(q.size() > 1){
            node curr = q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                System.out.print(curr.data+" ");
            }
        }
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void lineLevelOrder2(){
        lineLevelOrder(root);
    }
    
    private void lineLevelOrder2(node nn){
        Queue<node> q = new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            int count = q.size();
            for(int i = 0; i < count; count++){
                node curr = q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }
    
    
    //-----------------------------------------------------------------------------
    
    public int size(){
        return size(root);
    }
    
    private int size(node nn){
        
        if(nn==null){
            return 0;
        }
        
        return size(nn.right)+size(nn.left)+1;
    }
    
    
    //-----------------------------------------------------------------------------
    
    public int max(){
        return max(root);
    }
    
    private int max(node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int maximum = nn.data;
        maximum = Math.max(maximum, max(nn.left));
        maximum = Math.max(maximum, max(nn.right));
        return maximum;
    }
    
    
    //-----------------------------------------------------------------------------
    
    public void leftView(){
        leftView(root);
    }
    
    private void leftView(node nn){
        if(nn==null){
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            int count = q.size();
            for(int i = 0; i < count; i++){
                node curr = q.poll();
                if(i==0){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    
    public void leftViewRecursion(){
        leftViewRecursion(root, 1);
    }
    
    
    //-----------------------------------------------------------------------------
    
    private void leftViewRecursion(node nn, int level){
        
        if(nn==null){
            return;
        }
        
        if(level > maxLevel){
            System.out.print(nn.data+" ");
            maxLevel = level;
        }
        
        leftViewRecursion(nn.left, level+1);
        leftViewRecursion(nn.right, level+1);
    }
    
    public boolean childrenSum(){
        return childrenSum(root);
    }
    
    
    //-----------------------------------------------------------------------------
    
    private boolean childrenSum(node nn){
        if(nn==null || (nn.left==null && nn.right==null)){
            return true;
        }
        
        int sum = 0;
        if(nn.left!=null){
            sum += nn.left.data;
        }
        if(nn.right!=null){
            sum += nn.right.data;
        }
        return (nn.data==sum && childrenSum(nn.left) && childrenSum(nn.right));
    }
    
    public int balancedTree(){
        return balancedTree(root);
    }
    
    
    //-----------------------------------------------------------------------------
    
    private int balancedTree(node nn){
        if(nn==null){
            return 0;
        }
        
        int lh = balancedTree(nn.left);
        if(lh==-1){
            return -1;
        }
        
        int rh = balancedTree(nn.right);
        if(rh==-1){
            return -1;
        }
        
        if(Math.abs(lh-rh) > 1){
            return -1;
        }else{
            return (Math.max(lh, rh)+1);
        }
        
    }
    
    public int width(){
        return width(root);
    }
    
    
    //-----------------------------------------------------------------------------
    
    
    private int width(node nn){
        Queue<node> q = new LinkedList<>();
        q.add(nn);
        int sum = 0;
        while(!q.isEmpty()){
            int count = q.size();
            sum = Math.max(sum, count);
            for(int i = 0; i < count; i++){
                node curr = q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return sum;
    }
    
    public node BTtoLL(){
        return BTtoLL(root);
    }
    
    private node BTtoLL(node nn){
        
        if(nn==null){
            return nn;
        }
        
        node head = BTtoLL(nn.left);
        if(prev==null){
            head = nn;
        }else{
            nn.left = prev;
            prev.right = nn;
        }
        prev = nn;
        BTtoLL(nn.right);
        return head;
        
    }
    
    
    //-----------------------------------------------------------------------------
    
    
    int preIndex = 0;
    
    public node constructTree(int[] in, int[] pre, int is, int ie){
        if(is > ie){
            return null;
        }
        
        node nn = new node();
        nn.data = pre[preIndex++];
        int inIndex = is;
        for(int i = is; i <= ie; i++){
            if(in[i]==nn.data){
                inIndex = i;
                break;
            }
        }
        nn.left = constructTree(in, pre, is, inIndex+1);
        nn.right = constructTree(in, pre, inIndex+1, ie);
        return nn;
    }
    
    
    //-----------------------------------------------------------------------------
    
    
    public void spiralDisplay(){
        spiralDisplay(root);
    }
    
    private void spiralDisplay(node nn){
        Queue<node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean flag = false;
        q.add(nn);
        while(!q.isEmpty()){
            int count = q.size();
            for(int i = 0; i < count; i++){
                node curr = q.poll();
                if(flag){
                    s.push(curr.data);
                }else{
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(flag){
                while(!s.isEmpty()){
                    System.out.print(s.pop()+" ");
                }
            }
            flag = !flag;
            System.out.println();
        }
    }
    
    
    //-----------------------------------------------------------------------------
    
    
    public void spiralDisplay2(){
        spiralDisplay2(root);
    }
    
    private void spiralDisplay2(node nn){
        Stack<node> s1 = new Stack<>();
        Stack<node> s2 = new Stack<>();
        s1.push(nn);
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()){
                int count = s1.size();
                for(int i = 0; i < count; i++){
                    node curr = s1.pop();
                    System.out.print(curr.data+" ");
                    if(curr.left!=null)
                        s2.push(curr.left);
                    if(curr.right!=null)
                        s2.push(curr.right);
                }
                System.out.println();
            }
            if(!s2.isEmpty()){
                int count = s2.size();
                for(int i = 0; i < count; i++){
                    node curr = s2.pop();
                    System.out.print(curr.data+" ");
                    if(curr.right!=null)
                        s1.push(curr.right);
                    if(curr.left!=null)
                        s1.push(curr.left);
                }
                System.out.println();
            }
        }
    }
    
    
    //-----------------------------------------------------------------------------
    
    
    public int diameter(){
        diameter(root);
        return max;
    }
    int max = 0;
    private int diameter(node nn){
        if(nn==null) return 0;
        int hl = diameter(nn.left);
        int hr = diameter(nn.right);
        max = Math.max(max,(hl+hr+1));
        return 1+Math.max(hl,hr);
    }
    
    
    //-----------------------------------------------------------------------------
    
    
    public node LCA(int a, int b){
        return LCA(root,a,b);
    }
    private node LCA(node nn, int a, int b){
        if(nn==null) return null;
        if(nn.data == a || nn.data == b) return nn;
        
        node LCA1 = LCA(nn.left, a ,b);
        node LCA2 = LCA(nn.right, a, b);
        
        if(LCA1!=null && LCA2!=null) return nn;
        
        if(LCA1 != null) return LCA1;
        
        else return LCA2;
    }
    
    
    //-----------------------------------------------------------------------------
    
    
    public ArrayList<Integer> Path(int n){
        ArrayList<Integer> a = new ArrayList<>();
        Path(root, a, n);
        return a;
    }
    
    public boolean Path(node nn, ArrayList<Integer> a, int n){
        if(nn==null) return false;
        a.add(nn.data);
        if(nn.data == n) return true;
        if(Path(nn.left, a, n) || Path(nn.right, a, n)) return true;
        a.remove(a.size()-1);
        return false;
    }
    
    
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
}

class client{
    public static void main(String[] args){
        BT bt = new BT();
        //        bt.display();
        //        bt.inorder_display();
        //        System.out.println();
        //        System.out.println(bt.height());
        //        bt.nodeAt_k(2);
        //        bt.lineLevelOrder2();
        //        System.out.println(bt.size());
        //        System.out.println(bt.max());
        bt.leftViewRecursion();
        System.out.println(bt.childrenSum());
        System.out.println(bt.balancedTree());
        System.out.println(bt.width());
        bt.spiralDisplay2();
        System.out.println(bt.Path(50));
        
    }
}


//input: 10 true 20 true 40 false false true 50 false false true 30 true 60 false false false