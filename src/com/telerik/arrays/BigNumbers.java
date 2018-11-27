package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class BigNumbers {
    private static void fakeInput() {
        String args = "5 5\n" +
                "0 3 9 3 2\n" +
                "5 9 5 1 7";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String arraySizesInput = reader.readLine();
        String[] arr1Input = reader.readLine().split(" ");
        String[] arr2Input = reader.readLine().split(" ");
        int size1 = arr1Input.length;
        int size2 = arr2Input.length;

        int difference = size1 - size2;
        int maxLength;
        int minLength;
        if (difference < 0) {
            maxLength = size2;
            minLength = size1;
        } else {
            maxLength = size1;
            minLength = size2;
        }

        int[] result = new int[maxLength];

        for (int i = 0; i < minLength; i++) {
            int sum = Integer.parseInt(arr1Input[i]) + Integer.parseInt(arr2Input[i]) + result[i];
            if (sum > 9) {
                sum = sum % 10;
                result[i + 1]++;

            }
            result[i] = sum;
        }

        if (difference < 0) {
            for (int i = minLength; i < size2; i++) {
                int sum = Integer.parseInt(arr2Input[i]) + result[i];
                if (sum > 9) {
                    sum = sum % 10;
                    result[i + 1]++;
                }
                result[i] = sum;
            }
        } else {
            for (int i = minLength; i < size1; i++) {
                int sum = Integer.parseInt(arr1Input[i]) + result[i];
                result[i] = sum;
            }
        }
    }
}