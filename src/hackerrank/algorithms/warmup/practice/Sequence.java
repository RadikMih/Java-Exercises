package hackerrank.algorithms.warmup.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Sequence {
    static int increasingSequence(List<Integer> inputElements) {

        if (inputElements.size() < 2){
            return 1;
        }
        int current = 0;
        int max = 1;
        int previous = inputElements.get(0);

        for (int i = 1; i < inputElements.size(); i++) {
            int next = inputElements.get(i);

            if (previous < next){
                current++;
            } else {
                if (current > max){
                    max = current;
                    current = 1;
                }
            }
            previous = next;
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputElementsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> inputElementsTemp = new ArrayList<>();

        IntStream.range(0, inputElementsCount).forEach(i -> {
            try {
                inputElementsTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> inputElements = inputElementsTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int res = increasingSequence(inputElements);


        System.out.println(res);
        bufferedReader.close();

    }
}
