package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CountingValleys {

    private static int countingValleys(int n, String s) {
        char[] letters = s.toCharArray();
        boolean isUnderSeaLevel = false;
        int result = 0;
        int tracker = 0;

        for (int i = 0; i < n; i++) {
            if (letters[i] == 'U') {
                tracker++;
            } else {
                tracker--;
            }

            if (tracker < 0) {
                isUnderSeaLevel = true;
            }

            if (isUnderSeaLevel && tracker == 0) {
                result++;
                isUnderSeaLevel = false;
            }
        }


        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        scanner.close();
        int result = countingValleys(n, s);

        System.out.println(result);
    }
}