import java.util.Arrays;
import java.util.Collections;

public class _07_ChocolaProblem {
    public static void main(String[] args) {
        int n=4,m=6;

        Integer verticalCost[] = {2,1,3,1,4};
        Integer horizontalCost[] = {4,1,2};

        Arrays.sort(verticalCost,Collections.reverseOrder());
        Arrays.sort(horizontalCost,Collections.reverseOrder());

        int h=0, v=0;
        int hp=1,vp=1;
        int cost = 0;

        while (v<verticalCost.length && h<horizontalCost.length) {
            if(verticalCost[v] <= horizontalCost[h]){ //select maximum cost - horizontal
                cost+= (horizontalCost[h] * vp);
                hp++;
                h++;
            }else{
                cost += (verticalCost[v] * hp);
                vp++;
                v++;
            }
        }
        while(v<verticalCost.length){
            cost += (verticalCost[v] * hp);
            vp++;
            v++;
        }
        while(h<horizontalCost.length){
            cost+= (horizontalCost[h] * vp);
            hp++;
            h++;
        }

        System.out.println("Total Minimum Cost = "+cost);
    }
}
