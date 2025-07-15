import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class _10_Top_view_of_Tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        Node node;
        int hd; // horizontal distance from root

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root) {
        Queue<Info> queue = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int minHd = 0, maxHd = 0;
        queue.add(new Info(root, 0));
        queue.add(null);

        while(!queue.isEmpty()) {
            Info current = queue.remove();
            if(current == null) {
                if(queue.isEmpty()) break;
                queue.add(null);
                continue;
            }
            // Process the current node
            Node node = current.node;
            int hd = current.hd;

            if(!map.containsKey(hd)) {
                map.put(hd, node);
            }

            minHd = Math.min(minHd, hd);
            maxHd = Math.max(maxHd, hd);

            if(node.left != null) {
                queue.add(new Info(node.left, hd - 1));
            }
            if(node.right != null) {
                queue.add(new Info(node.right, hd + 1));
            }
        }
        // Print the top view
        for(int i = minHd; i <= maxHd; i++) {
            if(map.containsKey(i)) {
                System.out.print(map.get(i).data + " ");
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);  
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        

        topView(root);
    }
}
