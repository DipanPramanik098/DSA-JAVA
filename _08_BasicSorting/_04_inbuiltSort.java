import java.util.*;
import java.util.Collections;

public class _04_inbuiltSort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        // O(nLogn)
        Arrays.sort(arr);
        // Arrays.sort(arr, starting Index, ending Index); ---->also applicatble

        print(arr);
        System.out.println();
        System.out.println("================================================");

        Integer arr1[] = { 5, 4, 1, 3, 2 }; // collections
        Arrays.sort(arr1, Collections.reverseOrder());

        print(arr1);
    }
}