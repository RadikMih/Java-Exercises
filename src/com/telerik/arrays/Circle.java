package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Circle {
    private static void fakeInput() {
        String args = "5 3\n" +
                "3\n" +
                "7\n" +
                "4\n" +
                "3\n" +
                "5";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputString = reader.readLine().split(" ");

        int number = Integer.parseInt(inputString[0]);
        int index = Integer.parseInt(inputString[1]) - 1;
        List<List<Integer>> numbers = new ArrayList<>(number);

        for (int i = 0; i < number; i++) {
            numbers.add(new ArrayList<>());
            int input = Integer.parseInt(reader.readLine()) - 1;
            numbers.get(i).add(input);
            numbers.get(i).add(i);
        }

        int currentIndex = 0;
        int nextIndex;

        while (numbers.size() > 2) {

            nextIndex = currentIndex + index;

            while (nextIndex >= numbers.size()){
                nextIndex = nextIndex % numbers.size();
            }

            currentIndex = nextIndex;
            index = numbers.get(nextIndex).get(0);
            numbers.remove(nextIndex);
        }

        System.out.println(numbers.get(0).get(1) + 1);
    }
}