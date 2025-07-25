
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _03_checkBipartite {

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

 public static boolean isBipartite(ArrayList<Edge>graph[]){
  int color[] = new int [graph.length];

  for(int i=0;i<graph.length;i++){
    color[i] = -1;
  }

  Queue<Integer>q = new LinkedList<>();
  for(int i=0; i<graph.length;i++){
    if(color[i] == -1){
      // bfs
      q.add(i);
      color[i] = 0; //yellow
      while(!q.isEmpty()){
        int curr = q.remove();
        for(int j=0; j<graph[curr].size(); j++){
          Edge e = graph[curr].get(j); // e.dest
          if(color[e.dest] == -1){
            int nextColor  = color[curr] == 0? 1:0;
            color[e.dest] = nextColor;
            q.add(e.dest);
          }
          else if(color[e.dest] == color[curr]) return false;
        }
      }
    }
  }
  return true;
 }


  // Main method to test
  public static void main(String[] args) {
    int V = 5;
    int[][] edges = {
        { 0, 1 },
        { 1, 2 },
        { 2, 3 },
        { 3, 4 }
    };
    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph, edges);

    System.out.println(isBipartite(graph));
  }
}
