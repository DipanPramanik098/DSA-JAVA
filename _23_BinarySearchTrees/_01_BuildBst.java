public class _01_BuildBst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node inSert(Node root, int val){
        if(root == null) return new Node(val);

        if(root.data > val) root.left = inSert(root.left, val);
        else{
            //right subtree root.data<val
            root.right = inSert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.err.print(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args) {
        System.out.println("Binary Search Tree");
        int values [] = {5,1,3,4,2,7};

        Node root = null;

        for(int i=0; i<values.length; i++){
            root = inSert(root, values[i]);
        }

        inOrder(root);
        System.out.println();
    }
}
