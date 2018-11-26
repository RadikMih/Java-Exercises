package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NFactorial {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine());

        System.out.println(CalcFactorial(n));

    }

    private static BigInteger CalcFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
           factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
