package com.telerik.loops;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestPrimeNumber {
    private static void fakeInput() {
        String args = "126";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = n; i >= 2; i--) {
          boolean isPrime = checkForPrime(i);

          if (isPrime){
              System.out.println(i);
              break;
          }
        }
    }

    private static boolean checkForPrime(int j) {
        boolean isPrime = true;
        if (j < 2) {
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}