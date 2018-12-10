package hackerrank.problemsolving.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] nk = console.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] visited = new int[k];

        int result = 0;

        for (int i = 0; i < n; i++) {
            int input = console.nextInt();
            int sum = input % k;
            int remainder = k - sum;
            if (remainder == k){
                remainder = 0;
            }
            result += visited[remainder];
            visited[sum]++;
        }
        System.out.println(result);
        console.close();
    }
}
