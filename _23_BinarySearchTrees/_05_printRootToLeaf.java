import java.util.ArrayList;

public class _05_printRootToLeaf {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void printPath(ArrayList<Integer>arr){
        for(int i=0; i<arr.size();i++){
            System.err.print(arr.get(i) + "->");
        }
        System.err.println("null");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> arr){
        
        if(root == null) return;

        arr.add (root.data);
        if(root.left == null && root.right == null){
            printPath(arr);
        }

        printRootToLeaf(root.left, arr);
        printRootToLeaf(root.right, arr);
        arr.remove(arr.size()-1);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        printRootToLeaf(root, new ArrayList<>());
    }
}
