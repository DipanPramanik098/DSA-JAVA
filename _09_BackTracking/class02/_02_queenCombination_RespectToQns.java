
public class _02_queenCombination_RespectToQns {
    public static void combination(int qPlaced, int tq, int start, boolean[] box, String ans) {
        if (qPlaced == tq) {
            System.out.println(ans);
            return;
        }

        int queen = qPlaced + 1; // current queen number

        for (int i = start; i < box.length; i++) {
            if (!box[i]) {
                box[i] = true; // place queen
                combination(qPlaced + 1, tq, i + 1, box, ans + "q" + queen + "b" + i + " ");
                box[i] = false; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int queens = 2;
        int boxes = 4;

        boolean[] box = new boolean[boxes];
        combination(0, queens, 0, box, "");
    }
}
