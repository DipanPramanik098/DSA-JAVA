public class _10_maxSubarraySum {
    // Brute Force Method
    public static int subarray(int a[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int currsum = 0; // Reset for each subarray

                for (int k = i; k <= j; k++) {
                    currsum += a[k]; // Compute sum of subarray
                }

                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {1, -2, 6, -1, 3};

        System.out.println("Max Subarray Sum = " + subarray(a));
    }
}
