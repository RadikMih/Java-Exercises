package com.radik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

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

    private static Deque<Cell> queue = new ArrayDeque<>();
    private static int currentArea;
    private static int maxArea;
    private static String[][] matrix;

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        matrix = new String[n][m];
        maxArea = 0;

        for (int i = 0; i < n; i++) {
            matrix[i] = reader.readLine().split(" ");
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String current = matrix[i][j];
                if (current.equals("x")) {
                    continue;
                }
                currentArea = 0;
                Cell cell = new Cell(i, j);
                queue.add(cell);

                bfs(current);


            }
        }

        System.out.println(maxArea);

    }

    private static void bfs(String value) {

        int[] dRow = {-1, 0, +1, 0};
        int[] dCol = {0, +1, 0, -1};

        while (!queue.isEmpty()) {
            Cell currentCell = queue.poll();
            int row = currentCell.getRow();
            int col = currentCell.getCol();

            for (int i = 0; i < dRow.length; i++) {
                int nextRow = row + dRow[i];
                int nextCol = col + dCol[i];

                if (isInMatrix(nextRow, nextCol)) {
                    if (matrix[nextRow][nextCol].equals(value)) {
                        currentArea++;
                        Cell next = new Cell(nextRow, nextCol);
                        queue.add(next);
                        matrix[nextRow][nextCol] = "x";
                    }
                }
            }
        }

        if (currentArea > maxArea) {
            maxArea = currentArea;
        }

    }

    private static boolean isInMatrix(int nextRow, int nextCol) {
        return nextRow > -1 && nextRow < matrix.length && nextCol > -1 && nextCol < matrix[0].length;
    }

    static class Cell {
        private int row;
        private int col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }
}

