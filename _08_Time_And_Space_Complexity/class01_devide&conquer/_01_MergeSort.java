public class _01_MergeSort {

    public static int[] mergedSorted(int a1[], int a2[]) {
        int merged[] = new int[a1.length + a2.length];

        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                merged[k] = a1[i];
                i++;
            } else {
                merged[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < a1.length) {
            merged[k] = a1[i];
            i++;
            k++;
        }
        while (j < a2.length) {
            merged[k] = a2[j];
            j++;
            k++;
        }
        return merged;
    }

    public static int[] mergeSort(int arr[], int low, int high) {
        if (low == high) {
            int[] base = new int[1];
            base[0] = arr[low];
            return base;
        }
        int mid = low + (high - low) / 2;
        int fh[] = mergeSort(arr, low, mid); // left half
        int lh[] = mergeSort(arr, mid + 1, high); // right half

        // merge left half and right half
        int merge[] = mergedSorted(fh, lh);
        return merge;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 11, 3, 11, 33, 2, 0, -1 };
        int ans[] = mergeSort(arr, 0, arr.length - 1);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
