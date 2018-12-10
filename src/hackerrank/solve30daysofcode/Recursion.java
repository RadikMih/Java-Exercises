package hackerrank.solve30daysofcode;

// Day 9: Recursion 3

import java.util.Scanner;

public class Recursion {
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
         return n * factorial(n - 1);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);

        scanner.close();
    }
}
