package dsa.stack;

import java.util.EmptyStackException;

public class DynamicStack <T> {

    private Node<T> top;

    public DynamicStack() {
        top = null;
    }

    public void push(T element) {
        Node<T> newItem = new Node<>(element);
        newItem.next = top;
        top = newItem;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = top.data;
        top = top.next;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    int size(){
        if (isEmpty()) {
            return 0;
        }
        int counter = 1;
        Node current = top;
        while (current.next != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
