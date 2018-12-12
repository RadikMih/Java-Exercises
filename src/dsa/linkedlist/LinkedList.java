package dsa.linkedlist;


public class LinkedList {
    private Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    boolean isEmpty(){
        return (head == null);
    }

    Node removeHead(){
        Node nodeToRemove = head;

        if (!isEmpty()){
            head = head.next;
        } else {
             throw new NullPointerException ("Stack is empty!");
        }
        return nodeToRemove;
    }

    void display(){
        Node node = head;

        while (node != null){
            node.display();
            node = node.next;
        }
    }
}
