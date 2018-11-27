package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZag {
    private static void fakeInput() {
        String args = "5 6";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        long sum = 1;

        int row = 1;
        int col = 1;

        int dRow = 1;
        int dCol = 1;

        while (!(row > n - 1) || !(row == n - 1 && col == m - 1)) {
            if (row > n - 1) {
                System.out.println(sum);
                return;
            }

            sum = sum + 3 * (row + col) + 1;

            int nextCol = col + dCol;

            if (nextCol < 0 || nextCol > m - 1) {
                dCol *= -1;
                dRow *= -1;
            }

            dRow *= -1;
            row = row + dRow;
            col = col + dCol;
        }

        System.out.println(sum);
    }
}