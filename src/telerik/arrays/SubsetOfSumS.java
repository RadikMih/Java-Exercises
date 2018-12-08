package telerik.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetOfSumS {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.valueOf(reader.readLine());

        String[] input = reader.readLine().split(" ");
        int[] numbers = new int[input.length];

        if (numbers.length == 0) {
            System.out.println("no");
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (sum == 0) {
            System.out.println("yes");
            return;
        }

        boolean isTrue = false;

        for (int i = 0; i < numbers.length; i++) {
            isTrue = hasSum(numbers, sum, numbers[i], i + 1);

            if (isTrue) {
                break;
            }
        }

        System.out.println(isTrue ? "yes" : "no");
    }

    private static boolean hasSum(int[] numbers, int sum, int firstNumber, int index) {
        for (int i = index; i < numbers.length; i++) {
            if (firstNumber + numbers[i] == sum) {
                return true;
            }
        }

        if (index < numbers.length - 1) {
            return hasSum(numbers,  sum,firstNumber + numbers[index], index + 1);
        } else {
            return false;
        }
    }
}


