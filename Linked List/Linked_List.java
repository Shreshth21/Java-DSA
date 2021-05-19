package LinkedList;

import java.security.spec.ECField;

public class Linked_List {


    //node class
    private class node{
        int data;
        node next;
    }



    //Linked_List data members
    private node head;
    private node tail;
    private int size;



    //display function
    public void display(){

        node temp = this.head;

        while(temp != null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println();
    }



    //Adding data at last
    public void addLast(int item){
        //creating a new node
        node nn = new node();
        nn.data =  item;
        //updating summary object of linked list class
        if(this.size==0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }else{
            this.tail.next = nn; // this line is to attach the linked list(providing the add of next node)
            this.tail = nn;
            this.size++;
        }
    }



    //adding data at first index
    public void addFirst(int item){
        node nn = new node();
        nn.data = item;
        if(this.size==0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }else{
            nn.next = this.head;
            this.head = nn;
            this.size++;
        }
    }



    //get the first value
    public int getFirst() throws Exception{

        if(this.size==0){
            throw new Exception("LL is empty");
        }else {
            return this.head.data;
        }
    }



    //get the last value
    public int getLast() throws Exception{

        if(this.size==0){
            throw new Exception("LL is empty");
        }else{
            return this.tail.data;
        }
    }



    //get the value at specific index
    public int getAt(int index) throws Exception{
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        else if(index<0 || index>=this.size){
            throw new Exception("index out of bounds");
        }
        else{
            node temp = this.head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }



    //get the node at specific index
    private node getNode(int index) throws Exception{
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        else if(index<0 || index>=this.size){
            throw new Exception("index out of bounds");
        }
        else{
            node temp = this.head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }



    //Adding data at specific index
    public void addAt(int index, int data) throws Exception {
        if (index < 0 || index > this.size) {
            throw new Exception("out of bounds");
        }
        else if(index == 0){
            addFirst(data);
        }
        else if(index == this.size){
            addLast(data);
        }
        else {
            //accessing node at index-1
            node temp = getNode(index - 1);

            //new node creation
            node nn = new node();
            nn.data = data;

            //attaching the node
            nn.next = temp.next;
            temp.next = nn;

            //summary updation
            size++;
        }
    }



    //remove first node
    public int removeFirst() throws Exception{
        int rv = -1;
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        else if(this.size == 1){
            rv = head.data;
            this.head = null;
            this.tail = null;
            this.size--;
        }
        else{
            rv = head.data;
            this.head = this.head.next;
            size--;
        }
        return rv;
    }



    //removing last node
    public int removeLast() throws Exception{
        int rv = -1;
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        else if(this.size==1){
            rv = tail.data;
            this.head = null;
            this.tail = null;
            this.size--;
        }
        else{
            rv = tail.data;
            this.tail = getNode(this.size-2);
            tail.next = null;
            size--;
        }
        return rv;
    }



    //removing node at specified index
    public int removeAt(int index) throws Exception{
        int rv = -1;
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        else if(index>=this.size||index<0){
            throw new Exception("index out of bounds");
        }
        else if(index==0){
            return removeFirst();
        }
        else if(index == this.size-1){
            return removeLast();
        }
        else if(this.size==1){
            rv = head.data;
            this.tail = null;
            this.head = null;
            size--;
        }
        else{
            node temp = getNode(index-1);
            rv = temp.next.data;
            temp.next = temp.next.next;
            size--;
        }
        return rv;
    }



    //reversing the data of linked list
    public void reverseData() throws Exception{
        int left = 0;
        int right = this.size-1;
        while (left<right){
            node ln = getNode(left);
            node rn = getNode(right);
            int temp = ln.data;
            ln.data = rn.data;
            rn.data = temp;
            left++;
            right--;
        }

    }



    //reversing the pointers of linked list
    public void reversePointers(){
        node prev = this.head;
        node curr = prev.next;
        //reversing pointers
        while(curr!=null){
            node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        //swaping head and tail
        node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        this.tail.next = null;

    }



    //mid node
    public int midNode(){
        node slow = this.head;
        node fast = this.head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }



    //kth node from end
    public int KnodeFromEnd(int k) throws Exception{
        if(k<=0 || k>this.size){
            throw new Exception("invalid k");
        }else{
            node slow = this.head;
            node fast = this.head;
            for(int i=0; i<k; i++){
                fast = fast.next;
            }
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
    }



    //inserting an element in a sorted ll so that the list remains sorted
    public void sortedInsertion(int item){
        node nn = new node();
        nn.data = item;
        if(this.size==0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else if(this.head.data > item){
            addFirst(item);
        }
        else if(item>this.tail.data){
            addLast(item);
        }
        else {
            node temp = this.head;
            while (temp.next.data < item) {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
            size++;
        }
    }



    //pairwise swapping
    public void pairSwap(){
        node temp = this.head;
        while(temp!=null && temp.next!=null ){
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            temp = temp.next.next;
        }
    }


    //pairwise swapping but changing nodes link this time
    public void pairSwap2(){

    }


    //removing duplicates from sorted array
    public void removeDuplicates(){
        node temp = this.head;
        while(temp!=null && temp.next!=null){
            if (temp.data == temp.next.data){
                temp.next = temp.next.next;
                size--;
            }else {
                temp = temp.next;
            }
        }
    }


    //loop detection using floyd
    public void loopDetection(){
        node slow = this.head;
        node fast = this.head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                System.out.println("a loop is detected");
            }
        }
    }




    //segregating even odd
    public void evenOdd(){
        node eS=null,eE=null,oS=null,oE=null;
        for(node curr=head; curr!=null; curr=curr.next){
            int x=curr.data;
            if(x%2==0){
                if(eS==null){
                    eS=curr;
                    eE=eS;
                }else{
                    eE.next=curr;
                    eE=eE.next;
                }
            }else if(x%2!=0){
                if(oS==null){
                    oS=curr;
                    oE=oS;
                }else{
                    oE.next=curr;
                    oE=oE.next;
                }
            }
        }
        eE.next=oS;
        oE.next=null;
    }














}