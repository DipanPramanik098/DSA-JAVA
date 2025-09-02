
public class _01_reverseArray {
    public static void reverse(int[] arr) {
        int start = 0; // Start index
        int end = arr.length - 1; // End index

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; // Move start index forward
            end--; // Move end index backward
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the array
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        printArray(arr);

        reverse(arr);

        printArray(arr); // Print the reversed array
    }  
}
