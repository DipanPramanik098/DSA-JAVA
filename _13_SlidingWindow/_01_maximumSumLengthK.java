public class _01_maximumSumLengthK {
    public static void main(String[] args) {
        int [] a = {2,1,3,4,5,6,7,8,9,2,3};
        int k = 3;
        System.out.println(maxSum(a,k));
    }
    public static int maxSum(int[]a, int k){
        //1st window
        int sum = 0, ans = 0;
        for(int i=0; i<k;i++){
            sum += a[i];
        }
        ans = sum;
        for(int i=k;i<a.length;i++){
            sum += a[i]; //grow
            sum -= a[i-k]; //shrink
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
