import java.util.*;

public class Main {
    // Recursive function to find last index of M
    public static int lastIndex(int[] arr, int index, int M) {
        // Base case: if we reach end of array
        if (index == arr.length) {
            return -1;
        }

        // Recurse for the rest of the array
        int li = lastIndex(arr, index + 1, M);

        // If M was found later, return that index
        if (li != -1) {
            return li;
        }

        // Otherwise, check current index
        if (arr[index] == M) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        int N = sc.nextInt();

        // Input array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Input M
        int M = sc.nextInt();

        // Print last index of M
        System.out.println(lastIndex(arr, 0, M));
    }
}