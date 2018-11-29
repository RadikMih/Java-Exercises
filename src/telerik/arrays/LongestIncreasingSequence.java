package telerik.arrays;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LongestIncreasingSequence {
    private static void fakeInput() {
        String args = "8\n" +
                "7\n" +
                "3\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "2\n" +
                "2\n" +
                "4";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) {
        fakeInput();
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int max = 1;
        int current = 1;

//        int[] numbers = new int[n];
//        numbers[0] = Integer.parseInt(console.nextLine());
//
//        for (int i = 1; i < n; i++) {
//            numbers[i] = Integer.parseInt(console.nextLine());
//
//            if (numbers[i - 1] < numbers[i]) {
//                current++;
//            } else {
//                if (current > max) {
//                    max = current;
//                }
//                current = 1;
//            }
//        }

        int previous = Integer.parseInt(console.nextLine());

        for (int i = 1; i < n; i++) {
            int next = Integer.parseInt(console.nextLine());
            if (previous < next){
                current++;
            } else {
                if (current > max){
                    max = current;
                    current = 1;
                }
            }
            previous = next;
        }

        System.out.println(max);
    }
}

