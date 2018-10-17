package com.radik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostFrequentElement {
    private static void fakeInput() {
        String args = "13\n" +
                "4\n" +
                "1\n" +
                "1\n" +
                "4\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "4\n" +
                "1\n" +
                "2\n" +
                "4\n" +
                "9\n" +
                "3";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int appearanceCounter = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int counter = 0;

            for (int j = 0; j <n ; j++) {
               if (numbers[i] == numbers[j]){
                   counter++;
               }
            }

            if (counter > appearanceCounter){
                appearanceCounter = counter;
                index = i;
            }

        }

        System.out.printf("%d (%d times)",numbers[index],appearanceCounter);

    }
}
