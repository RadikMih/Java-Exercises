package com.telerik.graphs;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diameter {

    private static void fakeInput() {
        String args = "11\n" +
                "2 7 2\n" +
                "1 7 6\n" +
                "5 1 8\n" +
                "2 8 6\n" +
                "8 6 9\n" +
                "10 5 5\n" +
                "9 1 9\n" +
                "0 10 15\n" +
                "3 1 21\n" +
                "6 4 3";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    private static List<Map<Integer, Integer>> graph;
    private static int bestSum;
    private static int bestNode;

    public static void main(String[] args) throws IOException {
        fakeInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        graph = new ArrayList<>();
        bestSum = 0;
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            graph.add(new HashMap<>());
        }

        int node1 = 0;
        for (int i = 0; i < n-1; i++) {
            String[] input = reader.readLine().split(" ");

            node1 = Integer.parseInt(input[0]);
            int node2 = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);

            graph.get(node1).put(node2, weight);
            graph.get(node2).put(node1,weight);
        }

        dfs(node1, -1, 0);
        dfs(bestNode, -1, 0);
        System.out.println(bestSum);

    }

    private static void dfs(int node, int previousNode, int tempSum){
        if (tempSum > bestSum) {
            bestSum = tempSum;
            bestNode = node;
        }

        for (Map.Entry<Integer, Integer> children : graph.get(node).entrySet()) {
            int child = children.getKey();
            int weight = children.getValue();

            if (child != previousNode) {
                dfs(child, node, tempSum + weight);
            }

        }
    }
}
