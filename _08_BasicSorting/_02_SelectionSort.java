public class _02_SelectionSort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // pick the smallest from unsorted and put it at the begining
    public static void selectionSort(int a[]){
        for(int i=0; i<a.length-1;i++) {
            int index = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[index]>a[j]){
                    index = j;
                }
            }
            // swap
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }   
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        print(arr);
        System.out.println();

        selectionSort(arr);

        System.out.println("After sorting...");
        print(arr);
    } 
}
