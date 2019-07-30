package dsa.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StaticStack<T> {
    private int top = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;

    public StaticStack() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public void push(T element) {
        if (top == data.length) {
            ensureCapacity();
        }
        data[top++] = element;
    }


    public T pop() {
        if (!isEmpty()) {
            return (T) data[--top];
        }
        throw new EmptyStackException();
    }

    public T peek() {
        if (!isEmpty()) {
            return (T) data[top];
        }
        throw new EmptyStackException();
    }

    private void ensureCapacity() {
        int newSize = data.length * 2;
        data = Arrays.copyOf(data, newSize);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i < top; i++) {
            builder.append(data[i].toString());
            if (i < top - 1) {
                builder.append(", ");
            }
        }
        builder.append(']');
        return builder.toString();
    }

    public boolean isEmpty() {
        return top == 0;
    }
}