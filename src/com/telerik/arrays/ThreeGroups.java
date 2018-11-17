package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ThreeGroups {
    private static void fakeInput() {
        String args = "1 2 3 4 5 6 7";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());

        for (String str : input) {
            int number = Integer.parseInt(str);
            int group = number % 3;

            lists.get(group).add(number);
        }

        for (List<Integer> list : lists){
           for (Integer item : list){
               System.out.print(item + " ");
           }
            System.out.println();
        }


    }
}