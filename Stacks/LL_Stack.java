package Stacks;

public class LL_Stack {


    //node class
    private class node {
        int data;
        node next;
    }

    //Linked_List data members
    private node head;
    private node tail;
    private int size;


    //display function
    public void display() {

        node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void push(int x){
        node nn = new node();
        nn.data = x;
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
    public int pop() throws Exception{
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

}