
public class _02_printPattern {
    /*// todo:
        *
        * *
        * * *
        * * * *
        * * * * *
     */
    
     public static void print(int n, int row, int col){
        //  todo: base case
        if(row > n) return;

        // todo: print *
        if(col <= row){
            System.out.print( "* " );
            print(
                n, row, col+1);
        }
        // todo: print next Line
        else{
            System.out.println();
            print(n, row+1, 1);
        }
     }
     public static void main(String[] args) {
        print(6, 1, 1);
     }
}
