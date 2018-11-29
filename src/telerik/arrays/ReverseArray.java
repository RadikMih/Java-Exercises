package telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
    private static void fakeInput() {
        String args = "1 2 3 4 5 6 7";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

//        for (int i = input.length-1; i >= 1 ; i--) {
//            System.out.print(input[i] + ", ");
//        }
//        System.out.print(input[0]);

        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
        }

        for (int i = 0; i < input.length-1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.print(input[input.length -1]);
    }
}
