package com.radik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargesAreaInMatrix_BFS {
    private static void fakeInput() {
        String args = "5 6\n" +
                "1 3 2 2 2 4\n" +
                "3 3 3 2 4 4\n" +
                "4 3 1 2 3 3\n" +
                "4 3 1 3 3 1\n" +
                "4 3 3 3 1 1";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main (String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] maxtix = new int[n][m];


        for (int i = 0; i < n; i++) {
            String[] row = reader.readLine().split(" ");
        }




    }

}
