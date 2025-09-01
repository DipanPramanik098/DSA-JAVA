public class _04_maximum {

    // Function to find maximum element
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 45, 67, 2, 99, 34, 76 };

        int maximum = findMax(arr);
        System.out.println("Maximum element in the array: " + maximum);
    }
}
