package telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JoroTheRabbit {
    private static void fakeInput() {
        String args = "1, -2, -3, 4, -5, 6, -7, -8";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");
        int size = input.length;
        int[] path = new int[size];

        for (int i = 0; i < size; i++) {
            path[i] = Integer.parseInt(input[i]);
        }

        int bestLength = 0;

        for (int index = 0; index < size; index++) {
            for (int step = 0; step < size; step++) {
                int currentStep = index;
                int currentLength = 1;
                int nextStep = (index + step);

                if (nextStep >= size){
                    nextStep = nextStep - size;
                }

                while (path[currentStep] < path[nextStep]){
                    currentLength++;
                    currentStep = nextStep;

                    nextStep = (currentStep + step) % size;
                }

                if (currentLength > bestLength){
                    bestLength = currentLength;
                }
            }
        }

        System.out.println(bestLength);
    }
}
