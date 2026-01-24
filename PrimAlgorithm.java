// Prism's Algorithm for MST 
//Time: O(E log V)
//Space: O(V + E)

import java.util.*;
class PrimAlgorithm {
    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    // Pair class for Priority Queue
    static class Pair {
        int vertex;
        int weight;

        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    public static void primMST(List<List<Edge>> graph, int V) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq =
                new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));

        pq.add(new Pair(0, 0)); // start from node 0
        int mstCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.vertex;

            if (visited[u]) continue;

            visited[u] = true;
            mstCost += curr.weight;

            for (Edge e : graph.get(u)) {
                if (!visited[e.to]) {
                    pq.add(new Pair(e.to, e.weight));
                }
            }
        }
        System.out.println("Total cost of MST = " + mstCost);
    }
    public static void main(String[] args) {
        int V = 5;

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        // Undirected graph edges
        graph.get(0).add(new Edge(1, 2));
        graph.get(1).add(new Edge(0, 2));

        graph.get(0).add(new Edge(3, 6));
        graph.get(3).add(new Edge(0, 6));

        graph.get(1).add(new Edge(2, 3));
        graph.get(2).add(new Edge(1, 3));

        graph.get(1).add(new Edge(3, 8));
        graph.get(3).add(new Edge(1, 8));

        graph.get(1).add(new Edge(4, 5));
        graph.get(4).add(new Edge(1, 5));

        graph.get(2).add(new Edge(4, 7));
        graph.get(4).add(new Edge(2, 7));

        primMST(graph, V);
    }
}

