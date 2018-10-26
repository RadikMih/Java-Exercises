package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymmetricArrays {

    private static void fakeInput() {
        String args = "4\n" +
                "1 2 3 2 1\n" +
                "2 1\n" +
                "1 2 2 1\n" +
                "4";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            int j = 0;
            for (; j < input.length / 2; j++) {
                if (!input[j].equals(input[input.length - j - 1])){
                    break;
                }
            }
            System.out.println(j == input.length / 2 ? "Yes" : "No");
        }
    }
}