public class _01_QueenPermutation {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;//total queen

        boolean board [] = new boolean[n];
        System.out.println("Backtracking");
        permutation(board, tq, 0 , "");
        // qpsf - queen place so far
    }    
    public static void permutation(boolean b[] , int tq, int  qpsf, String ans){

        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<b.length; i++){
            if(b[i]== false){
                b[i] = true;
                permutation(b, tq, qpsf+1, ans + "b" + i + "q" + qpsf);
                b[i] = false;
            }
        }
    }
}
