import java.util.ArrayList;

public class _04_detectCycleDirected {
  static class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
      this.src = src;
      this.dest = dest;
    }
  }

  // Function to add directed edge
  public static void addDirectedEdge(ArrayList<Edge>[] graph, int src, int dest) {
    graph[src].add(new Edge(src, dest));
  }

  // Create graph from edge list
  public static void createGraph(ArrayList<Edge>[] graph, int[][] edges) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int[] edge : edges) {
      int src = edge[0];
      int dest = edge[1];
      addDirectedEdge(graph, src, dest);
    }
  }

  public static boolean isCycle(ArrayList<Edge> graph[]) {
    boolean[] visited = new boolean[graph.length];
    boolean[] recursionStack = new boolean[graph.length];

    for (int i = 0; i < graph.length; i++) {
      if (!visited[i]) {
        if (isCycleUtil(graph, i, visited, recursionStack)) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, boolean[] stack) {
    visited[curr] = true;
    stack[curr] = true;

    for (Edge e : graph[curr]) {
      if (stack[e.dest])
        return true;
      if (!visited[e.dest] && isCycleUtil(graph, e.dest, visited, stack))
        return true;
    }

    stack[curr] = false;
    return false;
  }

  public static void main(String[] args) {
    int V = 5;
    int[][] edges = {
        { 0, 1 },
        { 1, 2 },
        { 2, 3 },
        { 3, 1 }, // back edge → creates a cycle
        { 3, 4 }
    };

    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph, edges);

    System.out.println(isCycle(graph)); // Output: true
  }
}
