import java.util.*;
import java.util.LinkedList;

public class _01_graphValidTree {

    static class Solution {
        public boolean validTree(int n, int[][] edges) {
            if (edges.length != n - 1)
                return false; //a tree has n-1 edges 
            HashMap<Integer, List<Integer>> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                int a = edges[i][0];
                int b = edges[i][1];
                map.get(a).add(b);
                map.get(b).add(a);
            }
            return BFT(map);
        }

        public boolean BFT(HashMap<Integer, List<Integer>> map) {
            HashSet<Integer> visited = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();

            int count = 0;
            for (int src : map.keySet()) {
                if (visited.contains(src))
                    continue;
                count++;
                q.add(src);
                while (!q.isEmpty()) {
                    int rv = q.remove();
                    if (visited.contains(rv))
                        return false; // cycle detected

                    visited.add(rv);
                    for (int nbrs : map.get(rv)) {
                        if (!visited.contains(nbrs)) {
                            q.add(nbrs);
                        }
                    }
                }
            }
            return count == 1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 5;
        int[][] edges1 = {
                { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 }
        };
        System.out.println("Is valid tree? " + sol.validTree(n1, edges1)); // Expected: true

        int n2 = 5;
        int[][] edges2 = {
                { 0, 1 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 4 }
        };
        System.out.println("Is valid tree? " + sol.validTree(n2, edges2)); // Expected: false

        int n3 = 1;
        int[][] edges3 = {
                { 0, 0 }
        };
        System.out.println("Is valid tree? " + sol.validTree(n3, edges3)); // Expected: false
    }
}
