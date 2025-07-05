public class _01_BubbleSort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1;i++) {
            boolean swap = false;
            for(int j=0; j<arr.length -i -1; j++) {
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;
                }
                if(swap == false) break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,8,7,1,12,0,3};

        System.out.println("before sorting...");
        print(arr);
        System.out.println();

        bubbleSort(arr);

        System.out.println("After sorting...");
        print(arr);
    }    
}
