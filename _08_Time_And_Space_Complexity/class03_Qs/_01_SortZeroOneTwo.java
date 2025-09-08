public class _01_SortZeroOneTwo {

    // Function to sort an array of 0s, 1s and 2s using Dutch National Flag
    // Algorithm
    public static void sortColors(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) { 
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) { 
                mid++;
            } else { 
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Helper function to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 1, 0, 0, 2, 1 };

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sortColors(arr);

        System.out.println("\nAfter sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
