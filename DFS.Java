import java.util.ArrayList;

public class DFS {

    // Edge class
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Create Graph using Adjacency List
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // DFS function (Recursive)
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        boolean[] visited = new boolean[V];

        System.out.println("DFS Traversal:");
        dfs(graph, 0, visited); // Source = 0
    }
}
