
public class _01_CoinPermutation {
    public static void main(String[] args) {
        int target = 6;
        int coin[] = {2,1,3,5};    

        permutation(target, coin, "");
    }
    public static void permutation(int target, int coin[], String ans){
        if(target == 0){
            System.out.println(ans);
            return;
        }
        // if(target < 0) return;

        for(int i = 0; i<coin.length; i++){
            if(coin[i] <= target){
                permutation(target-coin[i], coin, ans + coin[i]);
            }
        }
    }
}
