
public class _03_coinChangePermutaion_RespectToCoin {
    public static void coinPermutation(int[] coins, int target, String ans) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            if (target - coins[i] >= 0) {
                // pick this coin and reduce target
                coinPermutation(coins, target - coins[i], ans + coins[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = { 2, 3, 5 };
        int target = 7;

        coinPermutation(coins, target, "");
    }
}
