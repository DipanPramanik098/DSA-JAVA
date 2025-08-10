public class _03_swapInArray {

    // Function to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line after printing all elements
    }

    // Function to swap two elements in an array
    public static void swapInArray(int[] arr, int i, int j) {
        if (i < arr.length && j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.println("Invalid indices for array swap!");
        }
    }

    // Function to swap two numbers (primitive type swap, doesn't affect original
    // values outside)
    public static void swapNumbers(int a, int b) {
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:  a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Array swapping
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("Array Before Swap:");
        printArray(arr);

        swapInArray(arr, 0, 4); // valid indices
        System.out.println("Array After Swap:");
        printArray(arr);

        System.out.println();

        // Number swapping
        int num1 = 100, num2 = 200;
        swapNumbers(num1, num2);
    }
}
