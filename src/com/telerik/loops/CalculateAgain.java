package com.telerik.loops;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class CalculateAgain {
    private static void fakeInput() {
        String args = "8\n" +
                "3";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int k = console.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (k == 0) {
            System.out.println(0);
            return;
        }

        BigInteger factN = calcFactorialBigInt(n);
        BigInteger factK = calcFactorialBigInt(k);

        BigInteger result = factN.divide(factK);

        System.out.println(result);

    }

    private static BigInteger calcFactorialBigInt(int num) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
