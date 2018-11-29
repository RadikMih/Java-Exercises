package hackerrank.problemsolving.warmup;

import java.util.Scanner;

public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {

        for (int i = 0; i < n; i++) {
            String result = "";
            for (int j = 0; j < n - i - 1; j++) {
                result += " ";
            }
            for (int j = 0; j < i+1; j++) {
                result += "#";
            }
            System.out.println(result);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}


