package hackerrank.solve30daysofcode;

import java.util.Scanner;

public class ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            System.out.println(Integer.parseInt(S));
        } catch (java.lang.NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
