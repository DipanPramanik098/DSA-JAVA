public class _04_coinChangePermutation {
    public static void coinChange(int[] coins, int target, String ans) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            coinChange(coins, target - coins[i], ans + coins[i] + " "); // not i+1 because we can reuse same coin
        }
    }

    public static void main(String[] args) {
        int[] coins = { 2, 3, 5, 6 };
        int target = 10;
        coinChange(coins, target, "");
    }
}
