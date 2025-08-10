public class _06_LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }   

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int target = 30;
        // int target2 = 302;
        int index = linearSearch(arr, target);
        if (index != -1) {  
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }    
}
