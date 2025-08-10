public class _09_rotateArray {
    // https://leetcode.com/problems/rotate-array/
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the array
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate
        System.out.println("Original Array:");
        printArray(arr);
        rotate(arr, k);
        System.out.println("Array after rotation:");
        printArray(arr);
    }

    // note: TLE
    // public static void rotate(int[] arr, int k) {
    //     int n  = arr.length;
    //     k = k % n; // Handle cases where k is greater than n
    //     for(int j=1; j<=k;j++){
    //         int lastEle = arr[n - 1]; // Store the last element
    //         for (int i = n - 2; i >= 0; i--) {
    //             arr[i + 1] = arr[i]; // Shift elements to the right
    //         }
    //         arr[0] = lastEle; // Place the last element at the start
    //     }
    // }

    // NOte: Optimized approach
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
    }

    // reverse
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; // Move start index forward
            end--; // Move end index backward
        }
    }
}
