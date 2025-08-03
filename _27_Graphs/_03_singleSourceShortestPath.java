import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class _03_singleSourceShortestPath {

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

        // Dijkstra Algorithm
        public void Dijkstra(int src) {
            HashSet<Integer> visited = new HashSet<>();
            PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
                @Override
                public int compare(DijkstraPair o1, DijkstraPair o2){
                    return o1.cost - o2.cost;
                }
            });

            pq.add(new DijkstraPair(src, "" + src, 0));

            while (!pq.isEmpty()) {
                DijkstraPair rp = pq.poll();
                if (visited.contains(rp.vtx)) {
                    continue;
                }
                visited.add(rp.vtx);
                System.err.println(rp);
                for (int nbrs : map.get(rp.vtx).keySet()) {
                    if (!visited.contains(nbrs)) {
                        int cost = rp.cost + map.get(rp.vtx).get(nbrs);
                        DijkstraPair np = new DijkstraPair(nbrs, rp.acq + nbrs, cost);
                        pq.add(np);
                    }
                }
            }

        }

        class DijkstraPair {
            int vtx;
            // aquiring path
            String acq;
            int cost;

            public DijkstraPair(int vtx, String acq, int cost) {
                this.vtx = vtx;
                this.acq = acq;
                this.cost = cost;
            }
            @Override
            public String toString(){
                return this.vtx + " " + this.acq + " @ " + this.cost;
            }
        }
    }

    // remove, ignore, visited, self Work, mark visited, add nbrs
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(1, 4, 2);
        g.addEdge(1, 2, 4);
        g.addEdge(2, 3, 5);
        g.addEdge(3, 4, 1);
        g.addEdge(4, 5, 6);
        g.addEdge(5, 6, 11);
        g.addEdge(7, 5, 1);
        g.addEdge(6, 7, 3);

        g.Dijkstra(1);
    }
}
