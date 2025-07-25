import java.util.*;

public class _05_topologicalSort {

  static class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
      this.src = src;
      this.dest = dest;
    }
  }

  // Function to create a directed graph
  public static void createGraph(ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    // Add directed edges
    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1, 2));
    graph[1].add(new Edge(1, 3));
    graph[2].add(new Edge(2, 4));
    graph[3].add(new Edge(3, 5));
    graph[4].add(new Edge(4, 5));
    graph[5].add(new Edge(5, 6));
  }

  // Topological Sort using DFS
  public static void topologicalSort(ArrayList<Edge>[] graph) {
    boolean[] visited = new boolean[graph.length];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < graph.length; i++) {
      if (!visited[i]) {
        topSortUtil(graph, i, visited, stack);
      }
    }

    // Print the topological order
    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }
  }

  // DFS utility function
  public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack) {
    visited[curr] = true;

    for (Edge e : graph[curr]) {
      if (!visited[e.dest]) {
        topSortUtil(graph, e.dest, visited, stack);
      }
    }

    stack.push(curr);
  }

  public static void main(String[] args) {
    int V = 7;
    ArrayList<Edge>[] graph = new ArrayList[V];

    createGraph(graph);

    System.out.println("Topological Sort (DFS):");
    topologicalSort(graph);
  }
}
