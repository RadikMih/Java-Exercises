package com.telerik.graphs;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RedRidingHood {
    private static void fakeInput() {
        String args = "10\n" +
                "0 3 0 1 0 4 0 4 0 2\n" +
                "6 9\n" +
                "2 9\n" +
                "7 6\n" +
                "8 2\n" +
                "3 8\n" +
                "10 2\n" +
                "5 7\n" +
                "1 8\n" +
                "4 10";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    private static Map<Integer, Set<Integer>> graph;
    private static int bestNode = -1;
    private static int bestSum = Integer.MIN_VALUE;
    private static int[] money;

    public static void main(String[] args) throws IOException {
        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        graph = new HashMap<>();
        int n = Integer.parseInt(reader.readLine());
        money = new int[n];

        String[] moneyInLocations = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(moneyInLocations[i]);
        }

        int node1 = 0;
        int node2;

        for (int i = 0; i < n - 1; i++) {
            String[] nodes = reader.readLine().split(" ");
            node1 = Integer.parseInt(nodes[0]) - 1;
            node2 = Integer.parseInt(nodes[1]) - 1;

            if(!graph.containsKey(node1)){
                graph.put(node1, new HashSet<>());
            }

            if(!graph.containsKey(node2)){
                graph.put(node2, new HashSet<>());
            }

            graph.get(node1).add(node2);
            graph.get(node2).add(node1);

        }

           dfs(node1, -1, 0);
           dfs(bestNode, -1, 0);

        System.out.println(bestSum);

    }

    private static void dfs(int currentNode, int previousNode, int currentSum) {
        currentSum += money[currentNode];
        if (currentSum > bestSum){
            bestSum = currentSum;
            bestNode = currentNode;
        }

        for (int child : graph.get(currentNode)){
            if (child != previousNode){
                dfs(child, currentNode, currentSum);
            }
        }
    }
}