public class _07_sumOfNodes {
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
    public static int sumNode(Node root){
            if(root == null) return 0;
            int leftSum = sumNode(root.left);
            int rightSum = sumNode(root.right);
            return leftSum + rightSum + root.data; 
        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right =new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(sumNode(root));
    }        
}
