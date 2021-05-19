package LinkedList;

public class doublyLinkedList {


    //node class
    private class node{
        int data;
        node next;
        node prev;
    }
    private int size;
    private node head;
    private node tail;



    //display function
    public void display(){
        node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println();
    }

    //insert at the beginning
    public void addFirst(int data){
        //new node
        node nn = new node();
        nn.data = data;
        if(this.size==0){
            this.size++;
            this.head = nn;
            this.tail = nn;
        }else{
            //attachments
            nn.next = this.head;
            this.head.prev = nn;
            //summary objects
            this.head = nn;
            this.size++;
        }
    }


    //insert at last
    public void addLast(int data){
        node nn = new node();
        nn.data = data;
        if(this.size==0){
            this.size++;
            this.head = nn;
            this.tail = nn;
        }else{
            this.tail.next = nn;
            nn.prev = this.tail;
            this.tail = nn;
            this.size++;
        }
    }



    //deleting the last node
    public int removeLast() throws Exception{
        int rv = this.tail.data;
        if(this.size==0){
            throw new Exception("LL is empty");
        }
        else if(this.size==1){
            this.tail = null;
            this.head = null;
            this.size--;
        }
        else{
            this.tail = this.tail.prev;
            this.tail.next = null;
            this.size--;
        }
        return rv;
    }



    //deleting the first node of LL
    public int removeFirst()throws Exception{
        int rv = this.head.data;
        if(this.size == 0){
            throw new Exception("LL is empty");
        }
        else if(this.size==1){
            this.tail = null;
            this.head = null;
            this.size--;
        }
        else{
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
        }
        return rv;
    }



    //reversing the list
    public void reverse() throws Exception{
        if(this.size==0){
            throw new Exception("LL is empty");
        }else{
            node temp = this.head;
            while(temp != null){
                node t = temp.prev;
                temp.prev = temp.next;
                temp.next = t;
                temp = temp.prev;
            }
            node t2 = this.tail;
            this.tail = this.head;
            this.head = t2;
        }
    }
}
