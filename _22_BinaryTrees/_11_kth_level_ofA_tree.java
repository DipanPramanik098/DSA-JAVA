public class _11_kth_level_ofA_tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthLevel(Node root, int level, int k){
        if(root == null) return;

        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);  
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        

        int k = 2;

        kthLevel(root, 1, k);
    }    
}
