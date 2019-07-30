package dsa.stack;

public class Node <T> {
    Node<T> next;
    T data;

    Node(T data) {
        this.data = data;
    }

    void display() {
        System.out.print(data + " ");
    }
}
