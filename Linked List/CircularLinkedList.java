package LinkedList;

public class CircularLinkedList {

    //node class
    private class node{
        int data;
        node next;
    }

    //data members
    private int size;
    private node head;
    private node tail;

    //display()
    public void display(){
        node temp = this.head;
        do{
            System.out.print(temp.data+", ");
            temp = temp.next;
        }while(temp != this.head);
        System.out.println();
    }



    //inserting of a node at begining
    public void addFirst(int item){
        node nn = new node();
        nn.data = item;
        if(this.size==0){
            this.head = nn;
            this.tail = nn;
            this.size++;
            nn.next = nn;
        }else {
            nn.next = this.head;
            this.tail.next = nn;
            this.size++;
            this.head = nn;
        }
    }



    //inserting at the end of linked list
    public void addLast(int item){
        addFirst(item);

        this.tail = this.tail.next;
        this.head = this.head.next;
    }


    //delete the head of circular LL
    public int removeFirst() throws Exception{
        int rv = head.data;
        if(this.size==0){
            throw new Exception("LL is empty");
        }else{
            this.tail.next = this.head.next;
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }



    //deleting the last node
    public int removeLast(){
        int rv = tail.data;
        node temp = this.head;
        while(temp.next != this.tail){
            temp = temp.next;
        }
        this.tail = temp;
        temp.next = temp.next.next;
        size--;
        return rv;
    }




    //deltion of kth node from start in LL
    public int removeK(int k) throws Exception{
        int rv = -1;
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        else if(k<=0 || k>this.size){
            throw new Exception("invalid k");
        }
        else if(k==1){
            removeFirst();
        }
        else if(k==this.size){
            removeLast();
        }
        else{
            node temp = this.head;
            for(int i=0; i<k-2; i++){
                temp = temp.next;
            }
            rv = temp.next.data;
            temp.next = temp.next.next;
            size--;
        }
        return rv;
    }
}