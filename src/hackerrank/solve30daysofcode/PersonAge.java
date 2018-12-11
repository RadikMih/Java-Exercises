package hackerrank.solve30daysofcode;

// Day 4: Class vs. Instance

import java.util.*;

public class PersonAge {
    private int age;

    public PersonAge(int initialAge) {
        // Add some more code to run some checks on initialAge

        if (initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            initialAge = 0;
        }

        age = initialAge;

    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age < 13){
            System.out.println("You are young.");
        } else if (age < 18){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age += 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            PersonAge p = new PersonAge(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}