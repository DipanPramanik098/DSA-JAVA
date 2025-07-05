public class _14_BuyAndSellStocks {
    public static int buyAndSell(int a[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPofit = 0;
        for(int i = 0; i < a.length; i++){
            if(buyPrice < a[i]){
                int profit = a[i] - buyPrice;
                maxPofit = Math.max(maxPofit, profit);
            }else{
                buyPrice = a[i];
            }
        }
        return maxPofit;
    }
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.err.println("MaxProfit  = "+buyAndSell(a));
    }
}
