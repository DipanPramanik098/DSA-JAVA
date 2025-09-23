public class _01_nQueen{
    public static void main(String[] args) {
        int qn = 4;
        int r=4, c= 4;
        boolean [][] board = new boolean[r][c];

        nQueen(board,qn,0);
    }

    public static void nQueen(boolean [][] board,int qn,int row){
        if(qn == 0){
            Display(board);
            return;
        }

        if(row >= board.length) return;

        for(int col = 0; col < board[row].length; col++){
            
            if(isPossible(board, row, col)){
                board[row][col] = true;
                nQueen(board,qn-1, row+1);
                board[row][col] = false;
            }
        }
        
    }

    public static boolean isPossible(boolean[][] board, int row, int col) {
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

    public static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == true){
                    System.out.print("Q" + " ");
                }else{
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}