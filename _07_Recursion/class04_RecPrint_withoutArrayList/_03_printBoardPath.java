
public class _03_printBoardPath {
    public static void printBoard(int target, String ans){
        if(target == 0){
            System.out.println(ans);
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=1; i<=6; i++){
            printBoard(target-i, i + ans);
        }
    }
    public static void main(String[] args) {
        printBoard(10,"");
    }    
}
