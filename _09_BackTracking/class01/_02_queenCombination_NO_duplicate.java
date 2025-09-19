public class _02_queenCombination_NO_duplicate {

    public static void combination(int qns, int start, boolean[] box, String ans) {
        if (qns == 0) {
            System.out.println(ans);
            return;
        }

        // Start from the current index to avoid duplicates
        for (int i = start; i < box.length; i++) {
            if (!box[i]) {
                box[i] = true; // place queen
                combination(qns - 1, i + 1, box, ans + "q" + qns + "b" + i + " ");
                box[i] = false; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int queens = 2;
        int boxes = 4;

        boolean[] box = new boolean[boxes];
        combination(queens, 0, box, "");
    }
}
