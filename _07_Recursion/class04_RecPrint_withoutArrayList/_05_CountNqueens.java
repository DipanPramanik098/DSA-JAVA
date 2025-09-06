public class _05_CountNqueens {     
    public static int countNqueen(boolean [][] board, int row){
        if(row == board.length) return 1;
        int count = 0;
        for(int col = 0; col <board[row].length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += countNqueen(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    public static boolean isSafe(boolean board[][], int row, int col){
        //todo: check row
        for(int j = col; j>=0; j--){
            if(board[row][j] == true) return false;
        }
        //todo: check diagonals
        // note: upper left
        for(int i = row,j=col; i>=0&&j>=0; i--,j--){
            if(board[i][j]) return false;
        }
        // note: upper right
        for (int i = row, j = col; i >=0 && j <board[i].length; i--, j++) {
            if (board[i][j])
                return false;
        }
        // note: lower left
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j])
                return false;
        }
        // note: lower  right
        for (int i = row, j = col; i < board.length && j < board[i].length; i++, j++) {
            if (board[i][j])
                return false;
        }
        //todo: check col
        for(int i=row; i>=0; i--){
            if(board[i][col] == true) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean [][] board = new boolean[4][4];
        
        System.out.println(countNqueen(board,0));
    }    
}
