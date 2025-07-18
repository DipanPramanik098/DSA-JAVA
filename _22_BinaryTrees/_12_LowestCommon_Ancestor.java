import java.util.ArrayList;

public class _12_LowestCommon_Ancestor {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;

        path.add(root);

        if (root.data == n)
            return true;

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight)
            return true;

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i))
                break;
            i++;
        }

        return path1.get(i - 1);
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2)
            return root;
        Node leftLca = lca2(root.left, n1, n2);
        Node rihgtLca = lca2(root.right, n1, n2);

        if (leftLca == null)
            return rihgtLca;
        if (rihgtLca == null)
            return rihgtLca;

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 6;

        System.out.println("LCA of " + n1 + " and " + n2 + ": " + lca(root, n1, n2).data);
        System.out.println("LCA of " + n1 + " and " + n2 + ": " + lca2(root, n1, n2).data);
    }
}
