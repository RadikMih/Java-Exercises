package telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Counting {
    private static void fakeInput() {
        String args = "solve([\"90\"]);";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        BigInteger number = solve(input);
        int iterations = 10;

        for (int i = 0; i <= iterations; i++) {
            System.out.println(number);
            number = number.add(BigInteger.ONE);
        }
    }

    private static BigInteger solve(String input){
        String numbers = input.replaceAll("[^0-9]", "");

        BigInteger result = new BigInteger(numbers);
        result.add(BigInteger.ONE);

        return result;
    }
}
