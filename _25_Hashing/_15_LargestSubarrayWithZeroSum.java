import java.util.HashMap;

public class _15_LargestSubarrayWithZeroSum {

    public static int findLargest(int arr[]) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1; // from index 0 to i
            }

            if (mp.containsKey(sum)) {
                int currLen = i - mp.get(sum);
                maxLen = Math.max(maxLen, currLen);
            } else {
                mp.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -11, 11, -7, -8 };

        System.out.println("Length of the largest subarray with zero sum: " + findLargest(arr));
    }
}
