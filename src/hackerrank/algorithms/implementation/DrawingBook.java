package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DrawingBook {

    private static int pageCount(int n, int p) {
        if (n == 1 || n == p) {
            return 0;
        }

        int counterBack;
        if (p <= n / 2) {
            return p / 2;
        } else {
            counterBack = (n - p) / 2;
            if (n % 2 == 0 && (n - p) % 2 != 0) {
                counterBack++;
            }
            return counterBack;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int result = pageCount(n, p);
        System.out.println(result);

        scanner.close();
    }
}