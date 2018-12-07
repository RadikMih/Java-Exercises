package hackerrank.problemsolving.implementation;

import java.util.Scanner;

public class BetweenTwoSets {

    private static int greatestCommonDivisor(int a, int b) {
        while (a > 0 && b > 0) {

            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b;
    }

    private static int leastCommonMultiple(int a, int b) {
        return (a / greatestCommonDivisor(a, b)) * b;
    }


    private static int getTotalX(int[] a, int[] b) {

        int multiple = 0;
        for (int i : b) {
            multiple = greatestCommonDivisor(multiple, i);
        }

        int factor = 1;
        for (int i : a) {
            factor = leastCommonMultiple(factor, i);
            if (factor > multiple) {
                return 0;
            }
        }

        if (multiple % factor != 0) {
            return 0;
        }

        int totalX = 1;

        for (int i = factor; i < multiple; i++) {
            if (multiple % i == 0 && i % factor == 0) {
                totalX++;
            }
        }

        return totalX;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        System.out.println(total);

    }
}
