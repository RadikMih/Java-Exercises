package hackerrank.problemsolving.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {

    private static int migratoryBirds(List<Integer> arr) {
        int differentTypes = 5;
        int[] birds = new int[differentTypes + 1];

        for (Integer item : arr) {
            birds[item]++;
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < birds.length; i++) {
            if (birds[i] > max){
                max = birds[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

        bufferedReader.close();
    }
}

