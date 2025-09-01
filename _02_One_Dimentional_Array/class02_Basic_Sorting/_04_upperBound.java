public class _04_upperBound {

    // Function to find index of x or -1 if not present
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid; // Found x
                break; // Stop since we only want the index of x
            } else if (arr[mid] < x) {
                low = mid + 1; // Move right
            } else {
                high = mid - 1; // Move left
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };

        int x1 = 6, x2 = 7;

        System.out.println("Index of " + x1 + " is: " + upperBound(arr, x1));
        System.out.println("Index of " + x2 + " is: " + upperBound(arr, x2));
    }
}
