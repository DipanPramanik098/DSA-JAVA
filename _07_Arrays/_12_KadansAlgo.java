public class _12_KadansAlgo {
    public static int kadan(int a[]){
        int maxi = Integer.MIN_VALUE;
        int currSum =0;
        for(int i = 0; i < a.length; i++){
            currSum += a[i];
            if(currSum<0) currSum=0;
            maxi = Math.max(maxi,currSum);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int a[]= {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum Sum  = "+kadan(a));
    }    
}
// TC : O(n)
