package telerik.arrays;

import java.util.Scanner;

public class SubsetOfSumS {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int sum = Integer.parseInt(console.nextLine());
        String[] input = console.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (hasSum(numbers, numbers.length, sum)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    private static boolean hasSum(int numbers[], int n, int sum)
    {
        if (sum == 0){
            return true;
        }

        if (n == 0){
            return false;
        }

        if (numbers[n-1] > sum){
            return hasSum(numbers, n-1, sum);
        }

        return hasSum(numbers, n-1, sum) || hasSum(numbers, n-1, sum-numbers[n-1]);
    }
}
