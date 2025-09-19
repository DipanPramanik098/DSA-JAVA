

public class _01_queenPermutaion_RespectToQns {
    public static void permutation(int qPlaced, int tq, boolean[] box, String ans) {
        if (qPlaced == tq) {
            System.out.println(ans);
            return;
        }

        int queen = qPlaced + 1; // current queen number

        for (int i = 0; i < box.length; i++) {
            if (!box[i]) { // place only in empty box
                box[i] = true;
                permutation(qPlaced + 1, tq, box, ans + "q" + queen + "b" + i + " ");
                box[i] = false; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int queens = 2;
        int boxes = 4;

        boolean[] box = new boolean[boxes];
        permutation(0, queens, box, "");
    }
}
