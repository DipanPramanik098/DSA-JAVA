public class _05_GridWays {
    public static int gridWays(int i, int j, int n, int m){
        // base case
        if(i==n-1 && j==m-1) return 1;
        else if (i==n || j==m) return 0;


        // 
        return gridWays(i+1, j, n, m) + gridWays(i, j+1, n, m);
    }
    public static void main(String[] args) {
        int n=2, m=2;
        System.out.println(gridWays(0, 0, n, m));
    }
}
