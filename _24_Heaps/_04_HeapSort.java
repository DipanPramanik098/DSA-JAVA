public class _04_HeapSort {
    // Function to perform heap sort (ascending order using Max-Heap)
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i); // Heapify each internal node
        }

        // Step 2: Extract elements one by one from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at index 'i' in array of size 'n'
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 10, 3, 5, 1, 2 };

        System.out.print("Original array: ");
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();

        heapSort(arr);

        System.out.print("Sorted array (ascending): ");
        for (int val : arr)
            System.out.print(val + " ");
    }
}
