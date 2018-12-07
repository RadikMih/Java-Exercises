package hackerrank.problemsolving.implementation;

import java.util.Scanner;

public class BreakingTheRecords {
    private static int[] breakingRecords(int[] scores) {
        int min = scores[0];
        int max = scores[0];

        int[] result = new int[2];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min){
                min = scores[i];
                result[1]++;
            } else if (scores[i] > max){
                max = scores[i];
                result[0]++;
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
