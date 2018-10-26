package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissCat {
    private static void fakeInput() {
        String args = "5\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "1\n" +
                "2";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] result = new int[11];

        for (int i = 0; i < n; i++) {
            int vote = Integer.parseInt(reader.readLine());
            result[vote]++;
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max){
                max = result[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}