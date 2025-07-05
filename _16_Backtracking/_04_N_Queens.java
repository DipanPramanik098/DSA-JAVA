import java.util.*;
public class _04_N_Queens {
    public static boolean isSafe(char board[][], int row, int col){
        // vertically up
        for(int  i = row-1; i>=0; i--){
            if(board[i][col] == 'Q') return false;
        }
        // diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q') return false;
        }
        // diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
    public static void nQueens(char board[][], int i){
        // base case
        if(i==board.length) {
            printBoard(board);
            System.out.println("================================================================");
            count++;
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, i, j)){
                board[i][j] = 'Q';
                nQueens(board, i+1);
                board[i][j] = '-';
            }
        }
    }
    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of Queens : ");
        n = sc.nextInt();
        char board[][] = new char[n][n];


        // initilize
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '-';
            }
        }

        nQueens(board, 0);
        System.out.println("Total ways = " + count);
    }    
}
