package com.telerik.loops;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ranks {
    private static void fakeInput() {
        String args = "4\n" +
                "1 7 3 9";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int index = 0;
            int counter = 0;

            for (int j = 0; j < n; j++) {
                index++;
                if (numbers[j] > max){
                    max = numbers[j];
                    counter = j;
                }
            }
            result[counter] = i + 1;
            numbers[counter]=Integer.MIN_VALUE;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}