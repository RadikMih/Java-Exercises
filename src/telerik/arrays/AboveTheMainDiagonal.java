package telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AboveTheMainDiagonal {
    private static void fakeInput() {
        String args = "4";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        long count;
        int base = 1;
        long sum = 0;

        long[][] matrix = new long[n][n];

        for (int i = 0; i < n; i++) {
            count = base;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = count;
                count *= 2;
            }
            base *= 2;

        }

        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                sum = sum + matrix[i][j];
            }

        }

        System.out.println(sum);

    }
}