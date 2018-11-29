package telerik.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kitty {

    private static void fakeInput() {
        String args = "@*@*@*xxx\n" +
                "1 -1 1 -1 2 1 1 1 1 1 1";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] path = reader.readLine().toCharArray();
        String[] numbers = reader.readLine().split(" ");
        int currentIndex = 0;
        int souls = 0;
        int food = 0;
        int deadlocks = 0;
        int jumpsCounter = 0;

        switch (path[currentIndex]){
            case '@':
                souls++;
                path[currentIndex] = '#';
                break;
            case '*':
                food++;
                path[currentIndex] = '#';
                break;
           default:
                System.out.println("You are deadlocked, you greedy kitty!");
                System.out.println("Jumps before deadlock: 0");
                return;
        }

        for (String number : numbers) {
            int nextMove = Integer.parseInt(number);
            int nextIndex = currentIndex + nextMove;

            while (nextIndex < 0) {
                nextIndex = nextIndex + path.length;
            }

            while (nextIndex > path.length - 1) {
                nextIndex = nextIndex - path.length;
            }

            jumpsCounter++;
            if (path[nextIndex] == '@') {
                souls++;
                path[nextIndex] = '#';
            } else if (path[nextIndex] == '*') {
                food++;
                path[nextIndex] = '#';
            } else if (path[nextIndex] == 'x') {
                deadlocks++;
                if (nextIndex % 2 == 0) {
                    if (souls < 1) {
                        System.out.println("You are deadlocked, you greedy kitty!");
                        System.out.printf("Jumps before deadlock: %d", jumpsCounter);
                        return;
                    } else {
                        path[nextIndex] = '@';
                        souls--;
                    }
                } else {
                    if (food < 1) {
                        System.out.println("You are deadlocked, you greedy kitty!");
                        System.out.printf("Jumps before deadlock: %d", jumpsCounter);
                        return;
                    } else {
                        path[nextIndex] = '*';
                        food--;
                    }
                }
            }

            currentIndex = nextIndex;

        }

        System.out.println("Coder souls collected: " + souls);
        System.out.println("Food collected: " + food);
        System.out.println("Deadlocks: " + deadlocks);

    }
}
