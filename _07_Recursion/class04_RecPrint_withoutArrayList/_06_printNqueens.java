public class _06_printNqueens {
    public static void printNqueen(boolean[][] board, int row, String ans) {
        // ✅ Base case: if all rows are filled, print solution
        if (row == board.length) {
            System.out.println(ans);
            return;
        }

        // Try placing queen in each column
        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true; // place queen
                printNqueen(board, row + 1, ans + "{" + (row + 1) + " , " + (col + 1) + "} ");
                board[row][col] = false; // backtrack
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // ✅ Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }

        // ✅ Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j])
                return false;
        }

        // ✅ Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j])
                return false;
        }

        return true; // safe to place queen
    }

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        printNqueen(board, 0, "");
    }
}
