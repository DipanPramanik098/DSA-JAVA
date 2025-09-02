
public class _01_kthROOT {
    // Function to find the kth root of a number n
    public static int findKthRoot(int n, int k) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow
            long power = 1;

            // Calculate mid^k using a loop to avoid overflow
            for (int i = 0; i < k; i++) {
                power *= mid;
                if (power > n)
                    break; // Stop if power exceeds n
            }

            if (power == n) {
                return mid; // Found the exact kth root
            } else if (power < n) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // No exact kth root found
    }

    public static void main(String[] args) {
        int n = 27; // Example number
        int k = 3; // Example root
        int result = findKthRoot(n, k);
        System.out.println("The " + k + "th root of " + n + " is: " + result);
    }    
}
