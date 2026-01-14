import java.util.ArrayList;

public class GraphDSA {

    // Edge class
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create graph using adjacency list
    public static void createGraph(ArrayList<Edge>[] graph) {

        // Vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // Vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 0));

        // Vertex 3
        graph[3].add(new Edge(3, 1));
    }

    public static void main(String[] args) {

        int V = 4; // number of vertices

        // Array of ArrayLists (Adjacency List)
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize each ArrayList
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Create the graph
        createGraph(graph);

        // Print the graph
        System.out.println("Graph (Adjacency List Representation):");
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }
    }
}

