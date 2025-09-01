
public class _02_swap {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int i=0;
        int j = 2;
        System.out.println((arr[i] + " " + arr[j]));

        swap(arr,i,j);

        System.out.println(arr[i] + " " + arr[j]);
    }    

    // todo: non-working swap
    public static void swap1(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    // todo: working swap
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
