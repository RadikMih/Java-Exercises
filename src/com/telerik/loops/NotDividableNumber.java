package com.telerik.loops;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotDividableNumber {
    private static void fakeInput() {
        String args = "10";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0){
                System.out.print(i + " ");
            }
        }
    }
}