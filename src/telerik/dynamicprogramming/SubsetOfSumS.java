package telerik.dynamicprogramming;

import java.util.Scanner;

public class SubsetOfSumS {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int sum = Integer.parseInt(console.nextLine());
        String[] input = console.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (sum == 0) {
            System.out.println("yes");
            return;
        }

        if (hasSum(numbers, numbers.length, sum)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }


    private static boolean hasSum(int numbers[], int n, int sum) {
        // The value of subset[i][j] will be true if there is a subset of set[0..j-1] with sum equal to i
        boolean result[][] = new boolean[sum + 1][n + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++) {
            result[0][i] = true;
        }

        // If sum is not 0 and set is empty, then answer is false
        for (int i = 1; i <= sum; i++)
            result[i][0] = false;

        // Fill the subset table in bottom up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                result[i][j] = result[i][j - 1];
                if (i >= numbers[j - 1])
                    result[i][j] = result[i][j] || result[i - numbers[j - 1]][j - 1];
            }
        }

        // uncomment this code to print table
//        for (int i = 0; i <= sum; i++) {
//            for (int j = 0; j <= n; j++){
//                System.out.print(result[i][j] + " ");
//            }
//                System.out.println();
//        }

        return result[sum][n];
    }
}
