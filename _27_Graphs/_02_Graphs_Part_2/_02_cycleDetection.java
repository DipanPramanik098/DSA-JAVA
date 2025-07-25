import java.util.ArrayList;

public class _02_cycleDetection {
  static class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
      this.src = src;
      this.dest = dest;
    }
  }

  // Function to add undirected edge
  public static void addUndirectedEdge(ArrayList<Edge>[] graph, int src, int dest) {
    graph[src].add(new Edge(src, dest));
    graph[dest].add(new Edge(dest, src));
  }

  // Create graph from edge list
  public static void createGraph(ArrayList<Edge>[] graph, int[][] edges) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int[] edge : edges) {
      int src = edge[0];
      int dest = edge[1];
      addUndirectedEdge(graph, src, dest);
    }
  }

  // Detect cycle in an undirected graph
  public static boolean detectCycle(ArrayList<Edge>[] graph) {
    boolean[] visited = new boolean[graph.length];

    for (int i = 0; i < graph.length; i++) {
      if (!visited[i]) {
        if (detectCycleUtil(graph, visited, i, -1)) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
    visited[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);

      if (!visited[e.dest]) {
        if (detectCycleUtil(graph, visited, e.dest, curr)) {
          return true;
        }
      } else if (e.dest != parent) {
        return true; // Found cycle
      }
    }

    return false;
  }

  // Function to be called from main
  public static boolean isCycle(int V, int[][] edges) {
    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph, edges);
    return detectCycle(graph);
  }

  // Main method to test
  public static void main(String[] args) {
    int V = 4;
    int[][] edges = {
        { 0, 1 },
        { 0, 2 },
        { 1, 2 },
        { 2, 3 }
    };

    boolean hasCycle = isCycle(V, edges);
    System.out.println("Cycle Present? " + hasCycle);
  }
}
