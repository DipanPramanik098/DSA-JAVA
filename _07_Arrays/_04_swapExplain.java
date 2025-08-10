public class _04_swapExplain {
    public static void swap(int[] arr, int[] other) {
        // Swapping the first elements of both arrays
        int temp = arr[0];
        arr[0] = other[0];
        other[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int [] other = {100, 200, 300, 400, 500};

        System.out.println(arr + "    " + other);
        System.out.println(arr[0] + "    " + other[0]);

        swap(arr,other);

        System.out.println(arr + "    " + other);
        System.out.println(arr[0] + "    " + other[0]);
    }
}
