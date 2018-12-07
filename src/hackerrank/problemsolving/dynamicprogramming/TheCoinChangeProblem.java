package hackerrank.problemsolving.dynamicprogramming;

import java.util.HashMap;
import java.util.Scanner;

public class TheCoinChangeProblem {

    private static long getWays(long[] coins, int money) {
        return getWays(coins, money, 0, new HashMap<String, Long>());
    }

    private static long getWays(long[] coins, int money, int index, HashMap<String, Long> memo) {
        if (money == 0) {
            return 1;
        }

        if (index >= coins.length) {
            return 0;
        }
        String key = money + "-" + index;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int amountWithCoin = 0;
        long ways = 0;

        while (amountWithCoin <= money) {
            int remaining = money - amountWithCoin;
            ways += getWays(coins, remaining, index + 1, memo);
            amountWithCoin += coins[index];
        }
        memo.put(key, ways);
        return ways;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(c, n);

        System.out.println(ways);

        scanner.close();
    }
}

