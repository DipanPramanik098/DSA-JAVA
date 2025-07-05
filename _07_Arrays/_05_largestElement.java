public class _05_largestElement {
    public static int largest(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxi) maxi = arr[i];
        }
        return maxi;
    }

    // TC = O(n)
    public static void main(String[] args) {
        int arr[] = {7,2,34,11,12,443,2,3,4};

        System.out.println("largest = "+largest(arr));
    }
}
