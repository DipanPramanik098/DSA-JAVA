
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _02_BFS {
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


  public static void bfs(ArrayList<Edge>graph[]){
    Queue<Integer>q = new LinkedList<>();
    boolean visited[]= new boolean[graph.length];
    q.add(0);  // source = 0


    while(!q.isEmpty()){
      int curr = q.remove();
      if(!visited[curr]) {
        System.out.println(curr+" ");
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
          Edge e = graph[curr].get(i);
          q.add(e.dest);
        }
      }
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

   
    bfs(graph);

  }
}
