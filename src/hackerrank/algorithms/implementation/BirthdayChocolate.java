package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BirthdayChocolate {
    private static int birthday(List<Integer> numbers, int d, int m) {
        int n = numbers.size();
        int sum;
        int count = 0;
        int j;
        int k;

        for (int i = 0; i <= n - m; i++) {
            k = i;
            sum = 0;
            j = 1;
            while (j <= m) {
                sum = sum + numbers.get(k);
                k++;
                j++;
            }
            if (sum == d)
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(numbers, d, m);

        System.out.println(result);

        bufferedReader.close();

    }
}
