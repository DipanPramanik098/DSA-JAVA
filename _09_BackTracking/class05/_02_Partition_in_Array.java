public class _02_Partition_in_Array {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 3, 8, 1, 4 };
        int idx = Partition(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int Partition(int [] arr, int si, int ei){
        // initial assumption
        int item = arr[ei];
        int idx = si;

        for(int i=si; i<ei; i++){
            if(arr[i] <= item){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        // place
        int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;
    }
}
