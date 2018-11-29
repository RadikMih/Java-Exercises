package telerik.graphs;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaximalPath {
    private static void fakeInput() {
        String args = "10\n" +
                "(5 <- 11)\n" +
                "(1 <- 8)\n" +
                "(11 <- 3)\n" +
                "(8 <- 7)\n" +
                "(1 <- 5)\n" +
                "(11 <- 2)\n" +
                "(8 <- 6)\n" +
                "(2 <- 15)\n" +
                "(8 <- 4)";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    private static Map<Integer, Set<Integer>> graph;
    private static long maxSum = Integer.MIN_VALUE;
    private static int bestNode = -1;


    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        graph = new HashMap<>();
        int n = Integer.parseInt(reader.readLine());

        int node1 = 0;
        int node2 = 0;

        for (int i = 0; i < n - 1; i++) {
            String input = reader.readLine();
            input = input.substring(1, input.length() - 1);
            int[] nodes = Arrays.stream(input.split(" <- ")).mapToInt(Integer::parseInt).toArray();

            node1 = nodes[0];
            node2 = nodes[1];

            if (!graph.containsKey(node1)) {
                graph.put(node1, new HashSet<>());
            }

            if (!graph.containsKey(node2)) {
                graph.put(node2, new HashSet<>());
            }

            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        dfs(node1, -1, 0);
        dfs(bestNode, -1, 0);

        System.out.println(maxSum);
    }

    private static void dfs(int currentNode, int previousNode, int currentSum) {
        currentSum += currentNode;

        if (currentSum > maxSum) {
            maxSum = currentSum;
            bestNode = currentNode;
        }

        for (int child : graph.get(currentNode)) {
            if (child != previousNode) {
                dfs(child, currentNode, currentSum);
            }
        }
    }
}
