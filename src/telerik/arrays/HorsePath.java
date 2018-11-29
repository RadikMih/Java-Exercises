package telerik.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorsePath {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];

        int row = 0;
        int col = 0;

        int[] dRow = {-2, -2, -1, -1, +1, +1, +2, +2};
        int[] dCol = {-1, +1, -2, +2, -2, +2, -1, +1};

        int counter = 1;
        matrix[row][col] = counter;

        while (counter != n * n) {
            for (int i = 0; i < dRow.length; i++) {
                int nextRow = row + dRow[i];
                int nextCol = col + dCol[i];

                if (nextRow < 0 || nextRow > matrix.length - 1 || nextCol < 0 || nextCol > matrix.length - 1 || matrix[nextRow][nextCol] != 0) {
                    if (i < dRow.length - 1) {
                        continue;
                    } else {
                        search:
                        for (int j = 0; j < n; j++) {
                            for (int k = 0; k < n; k++) {
                                if (matrix[j][k] == 0) {
                                    row = j;
                                    col = k;
                                    counter++;
                                    matrix[row][col] = counter;
                                    break search;
                                }
                            }
                        }
                        continue;
                    }
                }

                row = nextRow;
                col = nextCol;
                counter++;
                matrix[row][col] = counter;

                break;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
