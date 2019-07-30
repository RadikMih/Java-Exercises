package dsa.doublylinkedlist;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(3);
        list.deleteLastElement();
        list.append(3);
        list.deleteFirstElement();

        for (int i = 1; i <= 10; i++) {
            list.append(i);
        }

        list.print();
        System.out.println();
        list.deleteFirstElement();
        list.print();
        System.out.println();

        list.deleteLastElement();
        list.print();
        System.out.println();

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println(list.search(3));
        list.deleteWithValue(3);
        System.out.println(list.search(3));

        list.deleteWithValue(3);
        list.deleteWithValue(3);
    }
}
