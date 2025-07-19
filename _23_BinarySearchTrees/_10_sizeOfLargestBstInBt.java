public class _10_sizeOfLargestBstInBt {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        boolean isBst;
        int size;
        int mini;
        int maxi;

        public Info(boolean isBst, int size, int mini, int maxi){
            this.isBst = isBst;
            this.size = size;
            this.mini = mini;
            this.maxi = maxi;
        }
    }

    public static int maxBst = 0;


    public static Info largesrBst(Node root){

        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largesrBst(root.left);
        Info rightInfo = largesrBst(root.right);

        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(root.data, Math.min(leftInfo.mini,rightInfo.mini));
        
        int max = Math.max(root.data, Math.max(leftInfo.maxi,rightInfo.maxi));

        if(root.data <= leftInfo.maxi || root.data >= rightInfo.mini){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBst && rightInfo.isBst){
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }


    public static void main(String[] args) {
      Node root = new Node(50);  
      root.left = new Node(30);  
      root.left.left = new Node(5);  
      root.left.right = new Node(20);  

      root.right = new Node(60);
      root.right.left = new Node(45);
      root.right.right = new Node(70);
      root.right.right.left = new Node(65);
      root.right.right.right = new Node(80);


      Info info = largesrBst(root);

      System.out.println(maxBst);
    }
}
