
public class _02_CoinCombination {
    public static void main(String[] args) {
        int target = 4;
        int coin[] = { 2, 1, 3, 5 };

        Combination(target, coin, "", 0);
    }

    public static void Combination(int target, int coin[], String ans, int curr_index) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }
        // if(target < 0) return;

        for (int i = curr_index; i < coin.length; i++) {
            if (coin[i] <= target) {
                Combination(target - coin[i], coin, ans + coin[i], i);
            }
        }
    }
}
