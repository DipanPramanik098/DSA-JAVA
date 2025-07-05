public class _08_DiameterOfAtree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Approach 1
    public static int diaMeter(Node root){
        if(root == null) return 0;

        int leftD = diaMeter(root.left);
        int leftH = height(root.left);
        int rightD = diaMeter(root.right);
        int rightH = height(root.right);

        int selfD = leftH + rightH +1;

        return Math.max(selfD, Math.max(rightD, leftD));


    }

    // Approach 2
    static class Info{
        int diam, height;
        public Info(int diam, int height){
            this.diam = diam;
            this.height = height;
        }
    }
    public static Info Diameter(Node root){
        if(root == null) {
            return new Info(0,0);
        }

        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.
        height+rightInfo.height+1);

        int ht = Math.max(leftInfo.height , rightInfo.height) +1;

        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diaMeter(root));

        System.out.println(Diameter(root).diam);
    }
}
