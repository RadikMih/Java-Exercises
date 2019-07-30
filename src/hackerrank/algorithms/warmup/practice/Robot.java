package hackerrank.algorithms.warmup.practice;

import java.util.Scanner;

class Robot {
    private int currentX;
    private int currentY;
    private int previousX;
    private int previousY;

    public Robot(int x, int y) {
        currentX = previousX = x;
        currentY = previousY = y;
    }

    public Robot() {
        currentX = previousX = 0;
        currentY = previousY = 5;
    }

    public void moveX(int dx) {
        previousY = currentY;
        previousX = currentX;
        currentX += dx;
    }

    public void moveY(int dy) {
        previousY = currentY;
        previousX = currentX;
        currentY += dy;
    }

    public void printCurrentCoordinates() {
        System.out.println(currentX + " " + currentY);
    }

    public void printLastCoordinates() {
        System.out.println(previousX + " " + previousY);
    }

    public void printLastMove() {
        if (currentX != previousX) {
            System.out.println("x " + (currentX - previousX));
        }

        if (currentY != previousY) {
            System.out.println("y " + (currentY - previousY));
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        int dx = scan.nextInt();
        int dy = scan.nextInt();

        Robot firstRobot = new Robot();
        firstRobot.printCurrentCoordinates();

        Robot secondRobot = new Robot(x, y);
        secondRobot.printCurrentCoordinates();

        for (int i = 1; i < 3; i++) {
            secondRobot.moveX(dx);
            secondRobot.printLastMove();
            secondRobot.printCurrentCoordinates();
            secondRobot.moveY(dy);
            secondRobot.printLastCoordinates();

            dx += i * i;
            dy -= i * i;
        }
    }
}