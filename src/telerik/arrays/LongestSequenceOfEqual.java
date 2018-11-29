package telerik.arrays;

import java.util.Scanner;

public class LongestSequenceOfEqual {

//    public static void fakeInput() {
//        String args = "10\n" +
//                "2\n" +
//                "1\n" +
//                "1\n" +
//                "2\n" +
//                "3\n" +
//                "3\n" +
//                "2\n" +
//                "2\n" +
//                "2\n" +
//                "1";
//        System.setIn(new ByteArrayInputStream(args.getBytes()));
//    }

    public static void main(String[] args) {
       // fakeInput();
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int[] numbers = new int[n];
        int max = 0;
        int current = 1;

        numbers[0] = Integer.parseInt(console.nextLine());

        for (int i = 1; i < n; i++) {
            numbers[i] = Integer.parseInt(console.nextLine());

            if (numbers[i-1] == numbers[i]){
                current++;
            }else {
                if (current > max){
                    max = current;
                }
                current = 1;
            }
        }
        System.out.println(max);
    }
}
