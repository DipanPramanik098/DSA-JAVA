import java.util.HashMap;

public class _16_countSubArraySum {

    public static int count(int a[], int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        // sum, count

        mp.put(0,1);


        int sum =0;
        int ans = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];

            if(mp.containsKey(sum-k)){
                ans+=mp.get(sum-k);
            }

            // 
            if(mp.containsKey(sum)){
                mp.put(sum,mp.get(sum)+1);
            }else{
                mp.put(sum,1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        System.out.println(count(arr,k));
    }
}
