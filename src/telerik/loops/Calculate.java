package telerik.loops;

import java.io.ByteArrayInputStream;
        import java.io.IOException;
        import java.util.Scanner;

public class Calculate {
    private static void fakeInput() {
        String args = "5\n" +
                "-4";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        double x = Double.parseDouble(console.nextLine());

        double sum = 1;
        double fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact / (Math.pow(x, i));
        }

        System.out.printf("%.5f", sum);
    }
}