package com.telerik.loops;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMaxSumAverage {
    private static void fakeInput() {
        String args = "3\n" +
                "2\n" +
                "-1\n" +
                "4";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n;

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
            System.out.println(0);
            return;
        }

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        double number;
        for (int i = 0; i < n; i++) {
            try {
                number = Double.parseDouble(reader.readLine());
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {

                return;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }

            sum += number;
        }

        System.out.printf("min=%.2f%n", min);
        System.out.printf("max=%.2f%n", max);
        System.out.printf("sum=%.2f%n", sum);
        System.out.printf("avg=%.2f%n", sum / n);

    }
}