import java.util.Scanner;

public class _02_RatChasesItsCheese {
    /*
     * Input example:
     * 5 7
     * OXOOOOX
     * OXOXOXX
     * OXOXOOX
     * OOOXOXX
     * XXOXOOO
     *
     * Expected output (if path exists):
     * 1X1111X
     * 1X1X1XX
     * 1X1X1OX
     * 111X1XX
     * XXOX111
     */

    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // cols

        char[][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        int[][] ans = new int[n][m];

        Ratinmaze(maze, 0, 0, ans);

        if (!flag) {
            System.out.println("NO PATH FOUND");
        }
    }

    public static void Ratinmaze(char[][] maze, int cr, int cc, int[][] ans) {
        // base case: reached destination
        if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
            ans[cr][cc] = 1;
            display(ans, maze);
            flag = true;
            ans[cr][cc] = 0; // backtrack
            return;
        }

        // invalid case
        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return;
        }

        // mark visited
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        // directions → left, right, up, down
        int[] r = { 0, 0, -1, 1 };
        int[] c = { -1, 1, 0, 0 };

        for (int i = 0; i < 4; i++) {
            Ratinmaze(maze, cr + r[i], cc + c[i], ans);
        }

        // backtrack
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }

    public static void display(int[][] ans, char[][] maze) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                if (ans[i][j] == 1) {
                    System.out.print("1");
                } else {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println(); // extra line between multiple solutions
    }
}
