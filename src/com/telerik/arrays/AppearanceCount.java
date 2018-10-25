package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppearanceCount {

    private static void fakeInput() {
        String args = "8\n" +
                "28 6 21 6 -7856 73 73 -56\n" +
                "73";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String[] numbers = reader.readLine().split(" ");

        String x = reader.readLine();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i].equals(x)) {
                counter++;
            }
        }

        System.out.println(counter);





    }
}
