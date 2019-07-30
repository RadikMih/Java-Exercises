package dsa.arraylist;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayListImpl<Integer> list = new ArrayListImpl<>();

        list.add(3);
        System.out.println(list.get(0));

        list.set(0, 6);
        System.out.println(list.get(0));

        list.add(1, 5);
        System.out.println(list.get(1));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        list.remove(1);

        System.out.println(list.size());

    }
}
