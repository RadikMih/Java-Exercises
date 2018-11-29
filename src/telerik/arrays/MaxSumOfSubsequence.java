package telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumOfSubsequence {
    private static void fakeInput() {
        String args = "10\n" +
                "2\n" +
                "3\n" +
                "-6\n" +
                "-1\n" +
                "2\n" +
                "-1\n" +
                "6\n" +
                "4\n" +
                "-8\n" +
                "8";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int current = 0;
        int max = 0;

        //Kadane’s Algorithm
        for (int i = 0; i < n; i++) {
            int next = Integer.parseInt(reader.readLine());
            current += next;

            if (current < 0){
                current = 0;
            }

            if (current > max ) {
                max = current;
            }
        }
        System.out.println(max);
    }
}
