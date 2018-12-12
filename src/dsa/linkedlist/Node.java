package dsa.linkedlist;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
