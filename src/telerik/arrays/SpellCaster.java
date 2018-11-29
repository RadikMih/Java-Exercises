package telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SpellCaster {
    private static void fakeInput() {
        String args = "Hi exam";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        StringBuilder result = new StringBuilder();
        int maxLength = 0;

        for (String word : input) {
            int currentLength = word.length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j].isEmpty()) {
                    continue;
                }
                result.append(input[j].charAt(input[j].length() - 1));
                input[j] = input[j].substring(0, input[j].length() - 1);
            }
        }

        ArrayList<Character> spell = new ArrayList<>();
        for (int i = 0; i < result.length(); i++) {
            spell.add(i, result.charAt(i));
        }

        int step;
        int nextIndex;
        int size = spell.size();


        for (int i = 0; i < size; i++) {
            char letter = spell.get(i);

            step = Character.toLowerCase(letter) - 96;
            nextIndex = i + step;

            while (nextIndex >= size) {
                nextIndex = nextIndex - size;
            }

            spell.remove(i);
            spell.add(nextIndex, letter);
        }

        spell.forEach(System.out::print);
    }


}
