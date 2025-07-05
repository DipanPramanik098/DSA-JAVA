public class _11maxSubarray_prefixSum {
    public static int subArr(int a[]){
        int[] prefixArr = new int[a.length];
        prefixArr[0] = a[0];
        for(int i=1;i<a.length;i++){
            prefixArr[i] = prefixArr[i-1] + a[i];
        }
        int maxi=Integer.MIN_VALUE;
        int currsum =0;

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currsum = i==0?prefixArr[j]:prefixArr[j] - prefixArr[i-1];

                if(currsum>maxi){
                    maxi = currsum;
                }
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        int maxi = subArr(a);
        System.out.println("Maximum Sum : "+maxi);
    }    
}
