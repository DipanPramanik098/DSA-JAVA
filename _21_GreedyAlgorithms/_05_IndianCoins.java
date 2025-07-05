import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _05_IndianCoins {
    public static void main(String[] args) {
        Integer coins [] = {1,2,5,10,20,50,100,500,2000};
        int v = 1377;

        // info:sort in discending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        ArrayList<Integer>ans = new ArrayList<>();
        int i=0;
        while (i<coins.length){
            if(coins[i] <= v){
                ans.add(coins[i]);
                v-=coins[i];
                count++;
            }else{
                i++;
            }
        }
        System.out.println("No of coin = "+count);
        for(int j=0;j<ans.size();j++){
            System.err.print(ans.get(j)+" ");
        }
    }
}
