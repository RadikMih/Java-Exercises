package telerik.loops;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Calculate3 {
    private static void fakeInput() {
        String args = "52\n" +
                "5";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        fakeInput();

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int k = console.nextInt();
        int x = n - k;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (k == 0) {
            System.out.println(0);
            return;
        }
        if (x == 0) {
            System.out.println(0);
            return;
        }

        BigInteger factN = calcFactorialBigInt(n);
        BigInteger factK = calcFactorialBigInt(k);
        BigInteger factX = calcFactorialBigInt(x);

        BigInteger result = factN.divide(factK.multiply(factX));

        System.out.println(result);
    }

    private static BigInteger calcFactorialBigInt(int num) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}

