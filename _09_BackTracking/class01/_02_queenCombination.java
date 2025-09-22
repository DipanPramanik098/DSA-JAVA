
public class _02_QueenCombination {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;// total queen

        boolean board[] = new boolean[n];
        System.out.println("Backtracking");
        Combination(board, tq, 0, "", 0);
        // qpsf - queen place so far
    }

    public static void Combination(boolean b[], int tq, int qpsf, String ans, int last_idx) {

        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = last_idx; i < b.length; i++) {
            if (b[i] == false) {
                b[i] = true;
                Combination(b, tq, qpsf + 1, ans + "b" + i + "q" + qpsf, i+1);
                b[i] = false;
            }
        }
    }
}
