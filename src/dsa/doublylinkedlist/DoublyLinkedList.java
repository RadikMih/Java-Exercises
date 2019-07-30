package dsa.doublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList <T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        size = 0;
    }


    //adds element at the beginning of the linked list
    void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.previous = null;
        newNode.next = head;

        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    // adds element at the end of the linked list
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.previous = tail;
        newNode.next = null;

        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        if (head == null) {
            head = newNode;
        }
        size++;
    }

    Node<T> deleteFirstElement() {
        if (isEmpty()) {
            throw new NoSuchElementException("Doubly linked list is already empty");
        }
        Node<T> nodeToRemove = head;
        if (head.next != null) {
            head = head.next;
            head.previous = null;
        } else {
            head = null;
            tail = null;
        }
        size--;
        return nodeToRemove;
    }

    Node<T> deleteLastElement() {

        if (isEmpty()) {
            throw new NoSuchElementException("Doubly linked list is already empty");
        }
        Node<T> nodeToRemove = tail;

        if (tail.previous != null) {
            tail = tail.previous;
            tail.next = null;
        } else {
            tail = null;
            head = null;
        }
        size--;
        return nodeToRemove;
    }

    void deleteWithValue(T data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            deleteFirstElement();
            return;
        }

        if (tail.data.equals(data)) {
            deleteLastElement();
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            temp.previous = temp;
        }
        size--;
    }

    public boolean search(T data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    void print() {
        Node<T> node = head;

        while (node != null) {
            node.display();
            node = node.next;
        }
    }
}
