public class _11_ProductOfArrayExceptSelf {
    // https://leetcode.com/problems/product-of-array-except-self/description/
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        int n = nums.length;

        left[0] = 1; // Initialize the first element of left product array
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1]; // Calculate left product
        }
        right[n - 1] = 1; // Initialize the last element of right product array
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1]; // Calculate right product
        }
        for (int i = 0; i < n; i++) {
            nums[i] = left[i] * right[i]; // Final product calculation
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {-1,1,0,-3,3};
        _11_ProductOfArrayExceptSelf obj = new _11_ProductOfArrayExceptSelf();
        int[] result = obj.productExceptSelf(nums);
        System.out.print("Product of array except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
