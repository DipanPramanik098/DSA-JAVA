public class _06_BinarySearch {

    // Function for Binary Search
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // Element found
            } else if (arr[mid] < key) {
                low = mid + 1; // Search in right half
            } else {
                high = mid - 1; // Search in left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };
        int key = 40;

        int result = binarySearch(numbers, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
