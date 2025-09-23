import java.util.*;

public class Main {

    static List<String> paths = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // maze size
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][n];

        // Only start DFS if start cell is open
        if (maze[0][0] == 1) {
            findPaths(maze, 0, 0, "", visited);
        }

        Collections.sort(paths); // lexicographical order

        if (paths.size() == 0) {
            System.out.println(""); // no path exists
        } else {
            for (int i = 0; i < paths.size(); i++) {
                System.out.print(paths.get(i));
                if (i != paths.size() - 1)
                    System.out.print(" ");
            }
        }

        sc.close();
    }

    public static void findPaths(int[][] maze, int row, int col, String path, boolean[][] visited) {
        int n = maze.length;

        // base case: reached bottom-right
        if (row == n - 1 && col == n - 1) {
            paths.add(path);
            return;
        }

        visited[row][col] = true;

        // Directions: Down, Left, Right, Up (sorted lex order: D L R U)
        int[] r = { 1, 0, 0, -1 };
        int[] c = { 0, -1, 1, 0 };
        char[] move = { 'D', 'L', 'R', 'U' };

        for (int i = 0; i < 4; i++) {
            int newRow = row + r[i];
            int newCol = col + c[i];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n
                    && maze[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                findPaths(maze, newRow, newCol, path + move[i], visited);
            }
        }

        visited[row][col] = false; // backtrack
    }
}
