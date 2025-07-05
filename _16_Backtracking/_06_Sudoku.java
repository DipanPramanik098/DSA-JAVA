public class _06_Sudoku {
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check column
        for(int i = 0; i < 9; i++){
            if(board[i][col] == num) return false;
        }
        
        // Check row
        for(int j = 0; j < 9; j++){
            if(board[row][j] == num) return false;
        }
        
        // Check 3x3 grid
        int startRow = (row / 3) * 3; 
        int startCol = (col / 3) * 3; 
        for(int i = startRow; i < startRow + 3; i++){
            for(int j = startCol; j < startCol + 3; j++){
                if(board[i][j] == num) return false;
            }
        }
        
        return true;
    }
    public static boolean solveSudoku(int[][] board, int row, int col) {
        // Base case: If we've reached row 9, the board is solved
        if (row == 9) return true;
    
        // Move to the next cell
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col == 8) ? 0 : col + 1;
    
        // Skip filled cells
        if (board[row][col] != 0) {
            return solveSudoku(board, nextRow, nextCol);
        }
    
        // Try filling the cell with numbers 1-9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit; // Place digit
    
                if (solveSudoku(board, nextRow, nextCol)) return true; // Recur
    
                board[row][col] = 0; // Backtrack
            }
        }
    
        return false; // No valid number found
    }
    public static void main(String[] args) {
        int sudoku [][]={
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        

        if(solveSudoku(sudoku, 0, 0)){
            System.out.println("Solved Sudoku:");
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("No solution exists");
        }
    }
}
