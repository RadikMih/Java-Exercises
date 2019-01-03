package dsa.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = 3;

        for (int i = 1; i <= n; i++) {
            linkedList.append(i);
        }

        linkedList.prepend(100);

        linkedList.display();

        if (!linkedList.isEmpty()){
            System.out.println();
            System.out.println("Linked List is not empty");
        }

        linkedList.deleteWithValue(3);

        linkedList.display();

        Node<Integer> head = linkedList.removeHead();
        System.out.println();
        System.out.println(head.data);

        linkedList.display();
    }
}
