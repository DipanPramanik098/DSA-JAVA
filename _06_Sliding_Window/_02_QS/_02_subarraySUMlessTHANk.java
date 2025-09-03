
public class _02_subarraySUMlessTHANk {
    // https://leetcode.com/problems/subarray-product-less-than-k/description/

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 6 };
        int k = 100;

        System.out.println(numSubarrayProductLessThanK(arr, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int prod = 1;

        int count = 0;
        while (right < nums.length) {
            prod *= nums[right];

            while (prod >= k && left <= right) {
                prod /= nums[left];
                left++;
            }

            count += (right - left) + 1;
            right++;
        }
        return count;
    }
}
