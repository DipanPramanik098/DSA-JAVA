import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _01_topoSortBFS {
  
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
    int inDegree[] = new int[graph.length];
    calcIndegree(graph, inDegree);

    Queue<Integer>q = new LinkedList<>();

    for(int i=0;i<inDegree.length;i++){
      if(inDegree[i] == 0){
        q.add(i);
      }
    }

    while (!q.isEmpty()) {
      int curr = q.remove();
      System.out.println(curr + " ");

      for(int i=0;i<graph[curr].size(); i++){

        Edge e = graph[curr].get(i);
        inDegree[e.dest] --; 
        if(inDegree[e.dest] == 0){
          q.add(e.dest);
        }
      }
    }
    System.out.println();

  }

  public static void calcIndegree(ArrayList<Edge>graph[], int inDeg[]){
    for(int i=0;i<graph.length;i++){
      int v = i;
      for(Edge e: graph[v]){
          inDeg[e.dest]++;
      }
    }
  }



  public static void main(String[] args) {
    int V = 7;
    ArrayList<Edge>[] graph = new ArrayList[V];

    createGraph(graph);

    System.out.println("Topological Sort (DFS):");
    topologicalSort(graph);
  }
}
