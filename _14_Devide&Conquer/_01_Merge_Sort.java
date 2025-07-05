public class _01_Merge_Sort {
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int a[], int si, int ei) {
        if (si >= ei)
            return;
        // work
        int mid = si + (ei - si) / 2;

        // sort first and second halves
        mergeSort(a, si, mid);
        mergeSort(a, mid + 1, ei);

        // Merge
        merge(a, si, mid, ei);
    }

    public static void merge(int a[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // index of first half
        int j = mid + 1; // index of second half
        int k = 0; // index of temp array

        while (i <= mid && j <= ei) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= ei) {
            temp[k++] = a[j++];
        }

        // copy on the original array
        i = si;
        for (k = 0; k < temp.length; k++) {
            a[i]=temp[k];
            i++;
        }

    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(a, 0, a.length - 1);
        print(a);
    }
}
