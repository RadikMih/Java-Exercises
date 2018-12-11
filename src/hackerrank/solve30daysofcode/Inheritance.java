package hackerrank.solve30daysofcode;

// Day 12: Inheritance

import java.util.Arrays;
import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*   Class Constructor
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.*/

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    /*   Method Name: calculate
     *   @return A character denoting the grade. */

    char calculate() {
        int sum = Arrays.stream(testScores).reduce(0, Integer::sum);
        int avg = sum / testScores.length;

        char score;

        if (avg < 40) {
            score = 'T';
        } else if (avg < 55) {
            score = 'D';
        } else if (avg < 70) {
            score = 'P';
        } else if (avg < 80) {
            score = 'A';
        } else if (avg < 90) {
            score = 'E';
        } else {
            score = 'O';
        }
            return score;
        }
    }