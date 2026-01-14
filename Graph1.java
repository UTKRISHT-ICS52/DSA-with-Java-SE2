import java.util.ArrayList;
public class Graph1 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        // 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 0));

        // 3 vertex
        graph[3].add(new Edge(3, 1));
    }
    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        // Call graph creation
        createGraph(graph);

        // Print graph
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }
    }
}
