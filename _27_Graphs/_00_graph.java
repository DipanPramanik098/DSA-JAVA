import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _00_graph {
  public static class Graph {
    private static HashMap<Integer, HashMap<Integer, Integer>> map;

    //
    public Graph(int v) {
      map = new HashMap<>();
      for (int i = 1; i <= v; i++) {
        map.put(i, new HashMap<>());
      }
    }

    //
    public void addEdge(int v1, int v2, int cost) {
      map.get(v1).put(v2, cost);
      map.get(v2).put(v1, cost);
    }

    //
    public boolean containsEdge(int v1, int v2) {
      return map.get(v1).containsKey(v2);
    }

    //
    public boolean containsVertex(int v1) {
      return map.containsKey(v1);
    }

    //
    public int totalEdge() {
      int sum = 0;
      for (int it : map.keySet()) {
        sum += map.get(it).size();
      }
      return sum / 2;
    }

    //
    public void removeEdge(int v1, int v2) {
      if (containsEdge(v1, v2)) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
      }
    }

    //
    public void removeVertex(int v1) {
      // first remove from neighbour then delete v1
      for (int neighbours : map.get(v1).keySet()) {
        map.get(neighbours).remove(v1);
      }
      map.remove(v1);
    }

    //
    public void display() {
      for (int key : map.keySet()) {
        System.out.println(key + " ---> " + map.get(key));
      }
    }

    //
    public boolean hasPath(int src, int dest, HashSet<Integer> visited) {
      if (src == dest)
        return true;
      visited.add(src);
      for (int nbr : map.get(src).keySet()) {
        if (!visited.contains(nbr)) {
          boolean ans = hasPath(nbr, dest, visited);
          if (ans)
            return ans;
        }
      }
      visited.remove(src);
      return false;
    }

    public static void printAllPath(int src, int dest, HashSet<Integer> visited, String ans) {
      if (src == dest) {
        System.out.println(ans + src);
        return;
      }
      visited.add(src);
      for (int nbrs : map.get(src).keySet()) {
        if (!visited.contains(nbrs)) {
          printAllPath(nbrs, dest, visited, ans + src);
        }
      }
      visited.remove(src);
    }

    // note: Search
    // BFS
    public boolean BFS(int src, int dest) {
      HashSet<Integer> visited = new HashSet<>();
      Queue<Integer> q = new LinkedList<>();

      q.add(src);
      while (!q.isEmpty()) {
        // remove
        int rv = q.poll();
        // ignore if already visited
        if (visited.contains(rv))
          continue;
        // marked visited
        visited.add(rv);
        // self work
        if (rv == dest)
          return true;
        // add neighbours
        for (int nbrs : map.get(rv).keySet()) {
          if (!visited.contains(nbrs))
            q.add(nbrs);
        }
      }
      return false;
    }

    // DFS
    public boolean DFS(int src, int dest) {
      HashSet<Integer> visited = new HashSet<>();
      Stack<Integer> st = new Stack<>();

      st.push(src);
      while (!st.isEmpty()) {
        // remove
        int rv = st.pop();
        // ignore if already visited
        if (visited.contains(rv))
          continue;
        // marked visited
        visited.add(rv);
        // self work
        if (rv == dest)
          return true;
        // add neighbours
        for (int nbrs : map.get(rv).keySet()) {
          if (!visited.contains(nbrs))
            st.push(nbrs);
        }
      }
      return false;
    }

    // NOTE: Traversal {Disconnected Graph concepts}
    // BFT
    public void BFT() {
      HashSet<Integer> visited = new HashSet<>();
      Queue<Integer> q = new LinkedList<>();

      for (int src : map.keySet()) {
        if(visited.contains(src)) continue;
        q.add(src);
        while (!q.isEmpty()) {
          // remove
          int rv = q.poll();
          // ignore if already visited
          if (visited.contains(rv))
            continue;
          // marked visited
          visited.add(rv);
          // self work
          System.out.print(rv + " ");
          // add neighbours
          for (int nbrs : map.get(rv).keySet()) {
            if (!visited.contains(nbrs))
              q.add(nbrs);
          }
        }
      }
      System.out.println();
    }


    // DFT
    public void DFT(){
      HashSet<Integer> visited = new HashSet<>();
      Stack<Integer> st = new Stack<>();

      for(int src : map.keySet()){
        if(visited.contains(src)) continue;
        st.push(src);
        while (!st.isEmpty()) {
          // remove
          int rv = st.pop();
          // ignore if already visited
          if (visited.contains(rv))
            continue;
          // marked visited
          visited.add(rv);
          // self work
          System.out.print(rv + " ");
          // add neighbours
          for (int nbrs : map.get(rv).keySet()) {
            if (!visited.contains(nbrs))
              st.push(nbrs);
          }
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Graph g = new Graph(7);
    g.addEdge(1, 4, 6);
    g.addEdge(1, 2, 10);
    g.addEdge(2, 3, 7);
    g.addEdge(3, 4, 5);
    g.addEdge(4, 5, 1);
    g.addEdge(5, 6, 4);
    g.addEdge(7, 5, 2);
    g.addEdge(6, 7, 3);

    //
    g.display();
    //
    System.out.println(g.hasPath(1, 6, new HashSet<>()));
    //
    g.printAllPath(1, 6, new HashSet<>(), "");

    System.out.println(g.BFS(1, 6));
    System.out.println(g.DFS(1, 6));

    // 
    g.BFT();
    // 
    g.DFT();
  }
}
