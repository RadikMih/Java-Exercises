package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergingAndSquashing {
    private static void fakeInput() {
        String args = "11\n" +
                "44\n" +
                "69\n" +
                "46\n" +
                "63\n" +
                "83\n" +
                "13\n" +
                "62\n" +
                "14\n" +
                "31\n" +
                "68\n" +
                "87";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        StringBuilder merged = new StringBuilder();
        StringBuilder squashed = new StringBuilder();

        int firstNumber = Integer.parseInt(reader.readLine());

        for (int i = 1; i < n; i++) {
            int a = firstNumber / 10;
            int b = firstNumber % 10;

            int secondNumber = Integer.parseInt(reader.readLine());

            int c = secondNumber / 10;
            int d = secondNumber % 10;

            int bc = b + c;

            if (bc > 9){
                bc = bc % 10;
            }

            merged.append(b).append(c).append(" ");
            squashed.append(a).append(bc).append(d).append(" ");

            firstNumber = secondNumber;
        }

        System.out.print(merged);
        System.out.println();
        System.out.print(squashed);
    }
}
