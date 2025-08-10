
public class _04_MaximumSubarray {
    // https://leetcode.com/problems/maximum-subarray/description/

    // public int maxSubArray(int[] nums) {
    //     int ans = Integer.MIN_VALUE; // Initialize to the smallest possible integer
    //     for(int i=0; i<nums.length; i++) {
    //         int sum = 0;
    //         for(int j=i; j<nums.length; j++) {
    //             sum += nums[j]; // Calculate the sum of the subarray
    //             ans = Math.max(ans, sum); // Update the maximum sum found
    //         }
    //     }
    //     return ans; // Return the maximum subarray sum
    // }

    // Note: kadane's algorithm is a more efficient solution
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize to the first element
        int currentSum = nums[0]; // Start with the first element

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Update current sum
            maxSum = Math.max(maxSum, currentSum); // Update maximum sum found
        }
        return maxSum; // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        /*
         * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
         * Output: 6
         * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
         */ 
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        _04_MaximumSubarray obj = new _04_MaximumSubarray();
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);

    }
}
