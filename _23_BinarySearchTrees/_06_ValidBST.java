public class _06_ValidBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null) return
         true;

        if(min!= null && root.data <= min.data) return false;
        else if(max != null && root.data>= max.data) return false;

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
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

        System.err.println(isValidBST(root, null, null));
        
    }
}
