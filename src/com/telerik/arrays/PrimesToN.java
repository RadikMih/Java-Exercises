package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimesToN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            boolean isPrime = checkForPrime(i);

            if (isPrime){
                System.out.print(i + " ");
            }
        }

    }

    private static boolean checkForPrime(int j) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}