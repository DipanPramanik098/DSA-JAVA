public class _04_upperBound {

    // Function to find upper bound using binary search
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length; // high = n (not n-1)

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                // Move right if arr[mid] is less than or equal to x
                low = mid + 1;
            } else {
                // Candidate found, but look left for smaller index
                high = mid;
            }
        }

        return low; // Upper bound index
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };

        int x1 = 6, x2 = 7, x3 = 10;

        System.out.println("Upper bound of " + x1 + " is at index: " + upperBound(arr, x1));
        System.out.println("Upper bound of " + x2 + " is at index: " + upperBound(arr, x2));
        System.out.println("Upper bound of " + x3 + " is at index: " + upperBound(arr, x3));
    }
}
