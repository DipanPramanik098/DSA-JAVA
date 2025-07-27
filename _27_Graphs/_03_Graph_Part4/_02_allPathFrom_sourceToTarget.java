import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _02_allPathFrom_sourceToTarget {
// Graph edge class (optional for visualization)
    static class Edge {
        int src, dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create an adjacency list from edges
    public static Map<Integer, List<Integer>> createGraph(List<Edge> edges, int n) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (Edge e : edges) {
            graph.get(e.src).add(e.dest);
        }
        return graph;
    }

    // DFS to find all paths
    public static void dfs(int current, int destination, Map<Integer, List<Integer>> graph, 
                           List<Integer> path, List<List<Integer>> allPaths) {
        path.add(current);

        if (current == destination) {
            allPaths.add(new ArrayList<>(path)); // store a copy
        } else {
            for (int neighbor : graph.get(current)) {
                dfs(neighbor, destination, graph, path, allPaths);
            }
        }

        path.remove(path.size() - 1); // backtrack
    }

    // Main method to get all paths
    public static List<List<Integer>> findAllPaths(int n, List<Edge> edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = createGraph(edges, n);
        List<List<Integer>> allPaths = new ArrayList<>();
        dfs(source, destination, graph, new ArrayList<>(), allPaths);
        return allPaths;
    }

    public static void main(String[] args) {
        int n = 5; // Number of nodes
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1),
            new Edge(0, 2),
            new Edge(1, 3),
            new Edge(2, 3),
            new Edge(3, 4)
        );

        int source = 0, destination = 4;
        List<List<Integer>> paths = findAllPaths(n, edges, source, destination);

        System.out.println("All paths from " + source + " to " + destination + ":");
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
