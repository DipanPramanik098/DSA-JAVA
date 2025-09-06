
public class _04_printMaxzePath {
    public static void printBoard(int sr, int sc, int er, int ec, String ans){
        if(sc > ec || sr>er) return;
        if(sc == ec && sr==er){
            System.out.println(ans);
            return;
        }
        // 
        printBoard(sr+1, sc, er, ec, 'V'+ans);
        printBoard(sr+1, sc+1, er, ec, 'D'+ans);
        printBoard(sr, sc+1, er, ec, 'H'+ans);
    }
    public static void main(String[] args) {
        printBoard(0, 0, 3, 3, "");
    }    
}
