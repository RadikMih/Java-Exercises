package hackerrank.algorithms.warmup.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Replace {

    // Complete the replaceNumbers function below.
    static List<String> replaceNumbers() {
        int end = 100;
        List<String> result = new ArrayList<>();

        for (int i = 5; i <= end; i++) {
            if (i % 10 == 0 && i % 7 == 0){
                result.add("multipleOf_7_10");
            } else if (i % 7 == 0){
                result.add("multipleOf_7");
            } else if (i % 10 == 0){
                result.add("multipleOf_10");
            } else {
                result.add(i + "");
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<String> res = replaceNumbers();

        bufferedWriter.write(
                res.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedWriter.close();
    }
}
