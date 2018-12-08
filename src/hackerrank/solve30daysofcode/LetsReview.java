package hackerrank.solve30daysofcode;

// day 7

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            String s = console.nextLine();
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
               if (j % 2 == 0){
                   left.append(s.charAt(j));
               } else {
                   right.append(s.charAt(j));
               }
            }

            System.out.print(left.toString() + " " + right.toString());
            System.out.println();
        }


    }
}



