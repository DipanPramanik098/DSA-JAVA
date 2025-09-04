public  class  _08_isSorted{
    static boolean isSorted(int[] arr, int index) {
        // Base case: If we reach the last or only element
        if (index == arr.length - 1 || arr.length == 0) {
            return true;
        }

        // If the current element is greater than the next one, it's not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recur for the next pair
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 }; // change this to test

        if (isSorted(array, 0)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}