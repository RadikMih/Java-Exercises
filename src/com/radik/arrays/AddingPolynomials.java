package com.radik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingPolynomials {
    private static void fakeInput() {
        String args = "3\n" +
                "5 0 1\n" +
                "7 4 -3";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        String[] input1 = reader.readLine().split(" ");
        String[] input2 = reader.readLine().split(" ");

        String result = "";

        for (int i = 0; i < n; i++) {
            int number1 = Integer.parseInt(input1[i]);
            int number2 = Integer.parseInt(input2[i]);

            result += (number1 + number2 + " ");

        }

        System.out.println(result);


    }
}
