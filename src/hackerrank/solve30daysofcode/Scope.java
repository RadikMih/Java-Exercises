package hackerrank.solve30daysofcode;

// Day 14: Scope

import java.util.Arrays;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }


    void computeDifference(){
//        Arrays.sort(elements);
//        maximumDifference = Math.abs(elements[0] - elements[elements.length-1]);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
           if (elements[i] < min){
               min = elements[i];
           }

            if (elements[i] > max){
               max = elements[i];
            }

        }

        maximumDifference = max - min;
        


//        for (int i = 0; i < elements.length - 1; i++) {
//            int current = 0;
//            for (int j = i + 1; j < elements.length ; j++) {
//                current = Math.abs(elements[i] - elements[j]);
//                if (current > maximumDifference){
//                    maximumDifference = current;
//                }
//            }
//        }
    }
}






public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
