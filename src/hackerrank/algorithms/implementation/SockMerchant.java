package hackerrank.algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {
    private static int sockMerchant(int[] ar) {
        int result = 0;
        Set<Integer> socks = new HashSet<>();

        for (int number : ar) {
            if (socks.contains(number)) {
                result++;
                socks.remove(number);
            } else {
                socks.add(number);
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(ar);
        System.out.println(result);
        scanner.close();
    }
}

