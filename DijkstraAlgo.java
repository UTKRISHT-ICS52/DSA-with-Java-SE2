// DijkstraAlgo.java
// Time Complexity: 0(E + E log V)
// Space Complexity: O(V)
import java.util.*;

public class DijkstraAlgo {

    // Pair class to store (node, distance)
    static class Pair {
        int node, dist;

        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    // Dijkstra Algorithm
    static int[] dijkstra(int V, ArrayList<ArrayList<Pair>> adj, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.dist));

        pq.offer(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;

            if (curr.dist > dist[node]) continue;

            for (Pair edge : adj.get(node)) {
                int next = edge.node;
                int wt = edge.dist;

                if (dist[node] + wt < dist[next]) {
                    dist[next] = dist[node] + wt;
                    pq.offer(new Pair(next, dist[next]));
                }
            }
        }
        return dist;
    }

    // Driver code
    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(4, 1));
        adj.get(1).add(new Pair(2, 3));
        adj.get(4).add(new Pair(2, 2));
        adj.get(2).add(new Pair(3, 6));

        int src = 0;
        int[] dist = dijkstra(V, adj, src);

        System.out.println(Arrays.toString(dist));
    }
}

