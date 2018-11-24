package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ArraySearch {
    private static void fakeInput() {
        String args = "1,1,1,1,1,1,1,1";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(",");

        int n = input.length;
        Set<Integer> set = new HashSet<>();

        for (String anInput : input) {
            set.add(Integer.parseInt(anInput));
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)){
                builder.append(i + ",");
            }
        }

        if (builder.length() > 1){
            builder.deleteCharAt(builder.length()-1);
        }

        System.out.println(builder.toString());

    }
}
