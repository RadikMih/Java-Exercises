package com.telerik.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MaxSumOfKElements {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

//        Scanner console = new Scanner(System.in);
//        int n = console.nextInt();
//        int k = console.nextInt();


        int sum = 0;
        int[] numbers = new int[n];

        for (int i = 0; i < n ; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
//

//    Sorting array
//        Arrays.sort(numbers);
//        for (int i = n-1; i>=n-k; i--) {
//            sum += numbers[i];
//        }


//    Loop array
        for (int i = 0; i < k ; i++) {
            int max = Integer.MIN_VALUE;
            int index = 0;

            for (int j = 0; j < n; j++) {
                if (numbers[j] > max){
                    max = numbers[j];
                    index = j;
                }
            }

            sum += numbers[index];
            numbers[index] = Integer.MIN_VALUE;

        }

        System.out.println(sum);

//      Streaming API
//        System.out.println(Stream.generate(console::nextInt)
//                .limit(n)
//                .sorted(Comparator.reverseOrder())
//                .limit(k)
//                .mapToInt(Integer::valueOf)
//                .sum());

    }
}