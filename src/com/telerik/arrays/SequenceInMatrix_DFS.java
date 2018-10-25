package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceInMatrix_DFS {
    private static void fakeInput() {
        String args = "6 6\n" +
                "92 11 23 42 59 48\n" +
                "09 92 23 72 56 14\n" +
                "17 63 92 46 85 95\n" +
                "34 12 52 69 23 95\n" +
                "26 88 78 71 29 95\n" +
                "26 34 16 63 39 95";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    private static String[][] matrix;
    private static int maxLength;
    private static int currentLength;

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        matrix = new String[n][m];

        for (int i = 0; i < n; i++) {
            matrix[i] = reader.readLine().split(" ");
        }

        maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String current = matrix[i][j];
                if (current.equals("x")) {
                    continue;
                }

                currentLength = 0;
                dfs(i, j, matrix[i][j]);
            }
        }

        System.out.println(maxLength);

    }

    private static void dfs(int row, int col, String value) {
        int[] dx = {-1, -1, 0, +1, +1, +1, 0, -1 };
        int[] dy = {0, +1, +1, +1, 0, -1, -1, -1 };

        for (int i = 0; i < dx.length; i++) {
            int nextRow = row + dx[i];
            int nextCol = col + dy[i];

            if (isInMatrix(nextRow, nextCol)){
                if (matrix[nextRow][nextCol].equals(value)){
                    matrix[nextRow][nextCol] = "x";
                    currentLength++;
                    dfs(nextRow, nextCol, value);
                }
            }
        }

        if (currentLength > maxLength){
            maxLength = currentLength;
        }
    }

    private static boolean isInMatrix(int row, int col) {
        return row > -1 && row < matrix.length && col > -1 && col < matrix[0].length;
    }

}
