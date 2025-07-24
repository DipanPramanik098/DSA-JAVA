
import java.util.ArrayList;

public class _01_createAgraph {

  static class Edge{
    int src;
    int dest;
    int weight;

    public Edge(int src, int dest, int weight){
      this.src = src;
      this.dest = dest;
      this.weight = weight;
    }
  }
  public static void main(String[] args) {
    
    int V = 5;
    ArrayList<Edge>[]graph = new ArrayList[5];

    // null
    for(int i=0; i<V;i++){
      graph[i] = new ArrayList<>();
    }

    // 0-vertex
    graph[0].add(new Edge(0, 1, 5));

    // 1-vertex
    graph[1].add(new Edge(1, 0, 5));
    graph[1].add(new Edge(1, 1, 1));
    graph[1].add(new Edge(1, 3, 3));

    // 2-vertex
    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 2));

    // 3-vertex
    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));
    
    // 4-vertex
    graph[4].add(new Edge(4, 3, 4));

      // 2's neighbour
      for(int i=0;i<graph[2].size();i++){
        Edge e = graph[2].get(i);
        System.out.println("2 ->" + e.dest);
      } 

  }
}
