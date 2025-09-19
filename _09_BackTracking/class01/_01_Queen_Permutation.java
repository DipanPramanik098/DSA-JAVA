public class _01_Queen_Permutation {
    // n = 2 , box = 4 -> _ _ _ _
    // no of ways = 4P2 = 12
    // Examples: q1q2__, q1_q2_, q1__q2, _q1q2_, _q1_q2, __q1q2,
    // q2q1__, q2_q1_, q2__q1, _q2q1_, _q2_q1, __q2q1
    static int count = 0;
    public static void permutation(int qns, boolean[] box, String ans) {
        if (qns == 0) {
            count++;
            System.out.println(count + "   " +ans);
            return;
        }
        // Try placing the current queen in every empty box
        for (int i = 0; i < box.length; i++) {
            if (!box[i]) { // Only if the box is empty
                box[i] = true; // Place queen
                permutation(qns - 1, box, ans + "q" + qns + "b" + i + " ");
                box[i] = false; // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        int queens = 2;
        int boxes = 4;

        boolean[] box = new boolean[boxes];
        permutation(queens, box, "");
    }
}
