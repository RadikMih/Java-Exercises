package hackerrank.problemsolving.implementation;

import jdk.nashorn.internal.ir.IfNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheProgrammer {
    private static String dayOfProgrammer(int year) {
        if (year == 1918){
            return "26.09.1918";
        }
        if (isLeapYear(year)){
            return "12.09." + year;
        }
           return "13.09." + year;
    }

    private static boolean isLeapYear(int year){
        if (year % 4 != 0){
            return false;
        }

        if (year < 1918){
            return year % 4 == 0;
        } else {
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());
        String result = dayOfProgrammer(year);
        bufferedReader.close();

        System.out.println(result);
    }
}

