import java.util.*;

public class Main {

    public static boolean isPossible(int board[][], int row, int col, int n) {
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    public static int solve(int[][] board, int row, int n) {
        if (row == n) {
            return 1; // placed all queens successfully
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isPossible(board, row, col, n)) {
                board[row][col] = 1;
                count += solve(board, row + 1, n);
                board[row][col] = 0; // backtrack
            }
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int board[][] = new int[n][n];

        System.out.println(solve(board, 0, n));
    }
}
