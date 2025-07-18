public class _07_MirrorAbst {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node mirrorBST(Node root){
        if(root == null) return null;

        Node leftSubTree = mirrorBST(root.left);
        Node rightSubTree = mirrorBST(root.right);

        root.left = rightSubTree;
        root.right= leftSubTree;

        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = mirrorBST(root);

        preOrder(root);
    }
}
