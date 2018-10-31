package com.telerik.loops;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintDeck {
    private static void fakeInput() {
        String args = "10";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String toCard = reader.readLine();
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String value : values) {
            System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds \n", value, value, value, value);
            if (toCard.equals(value)) {
                return;
            }
        }
    }
}
