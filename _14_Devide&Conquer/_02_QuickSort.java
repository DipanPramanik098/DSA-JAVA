public class _02_QuickSort {
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int a[], int si, int ei){
        // base case
        if(si>=ei) return;
        int pivotIndex = partition(a, si, ei);

        quickSort(a, si, pivotIndex-1);
        quickSort(a, pivotIndex+1, ei);
    }
    public static int partition(int a[], int si, int ei){
        int pivot = a[ei];
        int i=si-1;
        for(int j=si; j<ei; j++){
            if(a[j]<=pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // place the pivot
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[ei] = temp;

        return i;
    }
    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(a, 0, a.length-1);
        print(a);
    }
}
