import java.util.*;

public class Main {

    public static void Display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(); // blank line between solutions
    }

    public static boolean isPossible(int[][] grid, int row, int col, int val) {
        // check row
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[row][j] == val)
                return false;
        }

        // check col
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] == val)
                return false;
        }

        // check 3x3 subgrid
        int r = row - (row % 3);
        int c = col - (col % 3);
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void sudokuSolver(int[][] grid, int row, int col) {
        if (col == grid[0].length) {
            col = 0;
            row++;
        }

        if (row == grid.length) {
            Display(grid);
            return;
        }

        if (grid[row][col] != 0) {
            sudokuSolver(grid, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isPossible(grid, row, col, val)) {
                    grid[row][col] = val;
                    sudokuSolver(grid, row, col + 1);
                    grid[row][col] = 0; // backtrack
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println("==================================================================");

        sudokuSolver(grid, 0, 0);
        sc.close();
    }
}
