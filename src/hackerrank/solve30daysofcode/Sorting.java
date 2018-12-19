package hackerrank.solve30daysofcode;

// Day 20: Sorting - Bubble sort

import java.util.Scanner;

public class Sorting {
    private static int counter = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);

        System.out.printf("Array is sorted in %d swaps.\n", counter);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);


    }

    private static void bubbleSort(int[] array){
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    counter++;
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
}
