// Kosaraju's Algorithm for Strongly Connected Components(SCC) 
// Time Complexity : O(V+E)
// Space Complecity : O(V+E)

import java.util.*;
class KosarajuAlgorithm {

    static void dfs1(int node, boolean[] visited, Stack<Integer> stack,
                     List<List<Integer>> graph) {

        visited[node] = true;

        for (int neigh : graph.get(node)) {
            if (!visited[neigh]) {
                dfs1(neigh, visited, stack, graph);
            }
        }
        stack.push(node); // finish time
    }
    static void dfs2(int node, boolean[] visited,
                     List<List<Integer>> revGraph) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neigh : revGraph.get(node)) {
            if (!visited[neigh]) {
                dfs2(neigh, visited, revGraph);
            }
        }
    }
    static void kosaraju(int V, List<List<Integer>> graph) {

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // Step 1: Fill stack
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs1(i, visited, stack, graph);
            }
        }
        List<List<Integer>> revGraph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            revGraph.add(new ArrayList<>());
        }

        for (int u = 0; u < V; u++) {
            for (int v : graph.get(u)) {
                revGraph.get(v).add(u);
            }
        }

        Arrays.fill(visited, false);

        System.out.println("Strongly Connected Components:");
        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                dfs2(node, visited, revGraph);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {

        int V = 5;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        // Directed edges
        graph.get(0).add(2);
        graph.get(2).add(1);
        graph.get(1).add(0);
        graph.get(0).add(3);
        graph.get(3).add(4);

        kosaraju(V, graph);
    }
}
