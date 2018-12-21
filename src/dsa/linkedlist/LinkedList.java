package dsa.linkedlist;


public class LinkedList<T> {
    private Node<T> head;

    public void append(T data) {
        if (head == null) {
            head = new Node<>(data);
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(data);
    }

    void prepend(T data) {
        Node<T> newHead = new Node<>(data);
        newHead.next = head;
        head = newHead;
    }

    void deleteWithValue(T data) {
        if (head == null) return;

        if (head.data.equals(data) ) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    boolean isEmpty(){
        return (head == null);
    }

    Node<T> removeHead(){
        Node<T> nodeToRemove = head;

        if (!isEmpty()){
            head = head.next;
        } else {
             throw new NullPointerException ("Stack is empty!");
        }
        return nodeToRemove;
    }

    void display(){
        Node<T> node = head;

        while (node != null){
            node.display();
            node = node.next;
        }
    }
}
