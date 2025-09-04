
public class _09_occurance {
    // Find first occurrence
    static int findFirst(int[] arr, int target, int index) {
        // Base case
        if (index == arr.length)
            return -1;

        if (arr[index] == target)
            return index;

        return findFirst(arr, target, index + 1);
    }

    // Find last occurrence
    static int findLast(int[] arr, int target, int index) {
        // Base case
        if (index < 0)
            return -1;

        if (arr[index] == target)
            return index;

        return findLast(arr, target, index - 1);
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 7, 3, 9, 3, 10 }; // example array
        int target = 3;

        int first = findFirst(array, target, 0);
        int last = findLast(array, target, array.length - 1);

        System.out.println("First occurrence of " + target + ": " + first);
        System.out.println("Last occurrence of " + target + ": " + last);
    }
}
