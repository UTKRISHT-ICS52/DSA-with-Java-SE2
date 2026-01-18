import java.util.*;

public class DirectedCycleDFS {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    // Create graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1)); // cycle here
    }

    // Cycle detection
    static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        boolean[] recStack = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (dfs(i, graph, visited, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(int curr, ArrayList<Edge>[] graph,
                       boolean[] visited, boolean[] recStack) {

        visited[curr] = true;
        recStack[curr] = true;

        for (Edge e : graph[curr]) {
            if (recStack[e.dest]) {
                return true; // cycle found
            }
            if (!visited[e.dest]) {
                if (dfs(e.dest, graph, visited, recStack)) {
                    return true;
                }
            }
        }

        recStack[curr] = false; // backtrack
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.println(isCycle(graph)); // true
    }
}

