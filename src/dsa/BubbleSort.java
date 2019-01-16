package dsa;

// space O(1)
// time O(n^2)

public class BubbleSort {
    private static void bubbleSort(int[] array){
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {7, 9, 4, 3, 2, 1, 8, 5};
        bubbleSort(array);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
