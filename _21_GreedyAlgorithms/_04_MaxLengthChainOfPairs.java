import java.util.Arrays;
import java.util.Comparator;

public class _04_MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int pairs[][] = {
                            {5,24},
                            {36,60},
                            {5,28},
                            {27,40},
                            {50,90}
                        };
        // info: sort based on last number
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int currEnd = pairs[0][1];  //select the first pair and store its last num
        int ans =1;
        for(int i=1;i<pairs.length;i++){
            if(currEnd < pairs[i][0]){
                ans++;
                currEnd = pairs[i][1];
            }
        }
        System.out.println("Chaim Length = "+ans);
    }    
}
