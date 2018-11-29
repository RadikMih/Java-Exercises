package hackerrank.problemsolving.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {

    static int[] gradingStudents(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38){
                continue;
            }

            if (grades[i] % 5 > 2){
                while(grades[i] % 5 != 0) {
                    grades[i]++;
                }
            }
        }


        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(result[resultItr]);
        }

    ;
    }
}
