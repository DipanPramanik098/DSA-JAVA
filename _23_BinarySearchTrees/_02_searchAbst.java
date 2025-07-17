
public class _02_searchAbst {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean search(Node root, int k){
        if(root == null) return false;

        if(root.data == k) return true;

        if(root.data > k){
            return search(root.left, k);
        }else {
            return search(root.right, k);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        int k = 11;

        System.err.println(search(root, k));
    }
}
