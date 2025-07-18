public class _03_DeleteANode {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node delete(Node root, int k) {
        if (root == null)
            return null; // always check for null

        if (root.data > k) {
            root.left = delete(root.left, k);
        } else if (root.data < k) { // 
            root.right = delete(root.right, k);
        } else {
            // Key found
            // Case 1: Leaf node
            if (root.left == null && root.right == null)
                return null;

            // Case 2: Single child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node is = findInorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        delete(root, 10); // deleting 10 instead of 1 for demonstration

        inOrder(root); // Expected Output: 3 5 6 8 11
    }
}
