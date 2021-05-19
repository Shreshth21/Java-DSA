package LinkedList;

public class Client {
    public static void main(String[] args) throws Exception {
        Linked_List ll = new Linked_List();
        ll.addLast(10);
        ll.addLast(12);
        ll.addLast(13);
        ll.addLast(24);
        ll.addLast(25);
        ll.addLast(36);
        ll.addLast(47);
        ll.display();
        ll.evenOdd();
        ll.display();
    }
}
