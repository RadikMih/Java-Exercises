package hackerrank.problemsolving.warmup;

import java.util.Scanner;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        double[] result = new double[3];
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                result[0]++;
            } else if (arr[i] < 0) {
                result[1]++;
            } else {
                result[2]++;
            }
        }

        double plus = result[0] / size;
        double minus = result[1] / size;
        double zero = result[2] / size;

        System.out.printf("%.6f\n%.6f\n%.6f\n", plus, minus, zero);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

