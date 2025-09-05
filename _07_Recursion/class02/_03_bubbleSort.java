public class _03_bubbleSort {

    public static void bubbleSort(int[] a, int si, int ei) {
        // Base case: when end index becomes 0, the array is sorted
        if (ei == 0) {
            return;
        }

        // If si < ei, compare and swap if needed
        if (si < ei) {
            if (a[si] > a[si + 1]) {
                // Swap
                int temp = a[si];
                a[si] = a[si + 1];
                a[si + 1] = temp;
            }
            // Recursive call to continue inner loop
            bubbleSort(a, si + 1, ei);
        } else {
            // One pass done, now sort remaining part
            bubbleSort(a, 0, ei - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 1, 4, 2, 8 };

        bubbleSort(a, 0, a.length - 1);

        // Print sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
