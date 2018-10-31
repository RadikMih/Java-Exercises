package com.telerik.loops;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class NumbersFrom1ToN {
    private static void fakeInput() {
        String args = "5";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }

        IntStream.range(1, n + 1).forEach(x -> System.out.print(x + " "));

    }
}