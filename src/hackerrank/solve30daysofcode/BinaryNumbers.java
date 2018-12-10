package hackerrank.solve30daysofcode;

// Day 10: Binary Numbers

import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (n <= 0)
        {
            System.out.println(0);
            return;
        }

        String binary = binary(n);
        System.out.println(binary);

        int max = 1;
        int current = 0;

        for (int i = 0; i < binary.length(); i++) {
           if (binary.charAt(i) == '1'){
               current++;
           } else {
               current = 0;
           }

            if (current > max){
                max = current;
            }
        }
        System.out.println(max);

    }

    private static String binary(int input){
        StringBuilder builder = new StringBuilder();

        while (input > 0)
        {
            builder.insert(0, (input % 2));
            input = input / 2;
        }
        return builder.toString();
    }
}