package dsa.arraylist;

import java.util.Arrays;

public class ArrayListImpl<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;

    public ArrayListImpl() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayListImpl(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        this.data = (T[]) new Object[initialCapacity];
    }

    public void add(T element) {
        if (size == data.length) {
            ensureCapacity();
        }
        data[size++] = element;
    }

    public void add(int index, T element) {
        if (size == data.length) {
            ensureCapacity();
        }
//        for (int i = size; i > index; i--) {
//            data[i] = data[i - 1];
//        }

        System.arraycopy(data, index, data, index + 1,
                size - index);

        data[index] = element;
        size++;
    }

    public T set(int index, T newValue) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T oldValue = data[index];
        data[index] = newValue;
        return oldValue;
    }

    public T get(int index) {
        if (index < size) {
            return data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T remove(int index) {
        if (index < size) {
            T obj = data[index];
            int temp = index;
            data[index] = null;

            while (temp < size) {
                data[temp] = data[temp + 1];
                data[temp + 1] = null;
                temp++;
            }

            size--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity() {
        int newSize = data.length * 2;
        data = Arrays.copyOf(data, newSize);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}
