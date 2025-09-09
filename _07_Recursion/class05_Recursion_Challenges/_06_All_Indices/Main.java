import java.util.*;

public class Main {
    // Recursive function to find all indices of 'm' in array 'arr'
    public static int[] allIndices(int[] arr, int idx, int m, int count) {
        // Base Case
        if (idx == arr.length) {
            return new int[count]; // return array of size equal to number of matches
        }

        // Recursive call
        if (arr[idx] == m) {
            int[] result = allIndices(arr, idx + 1, m, count + 1);
            result[count] = idx; // store index at correct position
            return result;
        } else {
            return allIndices(arr, idx + 1, m, count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number to search
        int m = sc.nextInt();

        // Call recursive function
        int[] result = allIndices(arr, 0, m, 0);

        // Print result
        for (int idx : result) {
            System.out.print(idx + " ");
        }
    }
}
