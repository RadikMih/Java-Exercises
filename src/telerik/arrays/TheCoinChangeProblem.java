package telerik.arrays;

import java.util.Scanner;

public class TheCoinChangeProblem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int sum = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int[] coins = new int[n];
        String[] coinsInput = console.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(coinsInput[i]);
        }
        System.out.println(change(coins, n, sum));
    }

    private static long change(int[] coins, int n, int sum) {
        long[] result = new long[sum + 1];
        result[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                result[j] += result[j - coins[i]];
            }
        }
        return result[sum];
    }
}

