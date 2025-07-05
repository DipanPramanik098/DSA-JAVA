import java.util.Arrays;
import java.util.Comparator;

public class _02_Fractional_Knapsack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int val[] = {60,100,120};
        int W  = 50;

        double ratio[][] = new double[weight.length][2];
        for(int i=0;i<weight.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        // sort in asscending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity = W;
        int finalValue=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalValue += val[idx];
                capacity -= weight[idx];
            }else{
                finalValue+=(ratio[i][1] * capacity);
                break;
            }
        }

        System.out.println("Final Value : " +finalValue);
    }
}
