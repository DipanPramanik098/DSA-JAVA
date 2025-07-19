public class _08_sortedArrayToBalancedBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node makeBst(int arr[], int start, int end) {

        if (start > end)
            return null;
        int mid = start + (end - start) / 2;

        Node root = new Node(arr[mid]);

        root.left = makeBst(arr, start, mid - 1);

        root.right = makeBst(arr, mid + 1, end);

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        int start = 0, end = arr.length - 1;

        Node root = makeBst(arr, start, end);
        preOrder(root);
    }
}
