public class _15_TransForm_sumTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int transForm(Node root){
        if(root == null ) return 0;
        int leftChild = transForm(root.left);

        int rightChild = transForm(root.right);

        int data = root.data;
        int newLeftData = root.left == null? 0:root.left.data;
        int newrightData = root.right == null? 0:root.right.data;

        root.data = newLeftData +  leftChild + newrightData + rightChild;
        return data;
    }

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        transForm(root);
        preOrder(root);
    }
}
