package dsa.doublylinkedlist;

public class Node <T> {
    T data;
    Node<T> previous;
    Node<T> next;

    Node(T data) {
        this.data = data;

    }

    void display() {
        System.out.print(data + " ");
    }
}