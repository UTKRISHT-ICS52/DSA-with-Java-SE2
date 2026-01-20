import java.util.*;

public class Graphp {

    static class Graph {
        int V;
        ArrayList<ArrayList<Integer>> adj;

        // Constructor
        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        // Add edge (Undirected Graph)
        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Breadth First Search (BFS)
        void bfs(int start) {
            boolean[] visited = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);

            System.out.print("BFS: ");
            while (!q.isEmpty()) {
                int curr = q.poll();
                System.out.print(curr + " ");

                for (int neigh : adj.get(curr)) {
                    if (!visited[neigh]) {
                        visited[neigh] = true;
                        q.add(neigh);
                    }
                }
            }
            System.out.println();
        }

        // Depth First Search (DFS)
        void dfs(int start) {
            boolean[] visited = new boolean[V];
            System.out.print("DFS: ");
            dfsUtil(start, visited);
            System.out.println();
        }

        void dfsUtil(int curr, boolean[] visited) {
            visited[curr] = true;
            System.out.print(curr + " ");

            for (int neigh : adj.get(curr)) {
                if (!visited[neigh]) {
                    dfsUtil(neigh, visited);
                }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.bfs(0);
        g.dfs(0);
    }
}

