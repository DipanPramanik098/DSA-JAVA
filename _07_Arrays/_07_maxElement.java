public class _07_maxElement {
    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            // if (arr[i] > max) {
            //     max = arr[i]; // Update max if a larger element is found
            // }
            max = Math.max(max, arr[i]); // Use Math.max to find the maximum element
        }
        return max; // Return the maximum element found
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Maximum Element: " + maxElement(arr));
    }
}
