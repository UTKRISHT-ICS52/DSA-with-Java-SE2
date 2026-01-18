import java.util.*;

class solutions10 {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(0, graph, path, result);
        return result;
    }

    private void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> result) {
        path.add(node);

        // If target reached
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
        } else {
            // Explore neighbors
            for (int next : graph[node]) {
                dfs(next, graph, path, result);
            }
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}
   
