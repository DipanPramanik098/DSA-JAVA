import java.util.*;

public class Main {
    public static boolean isSorted(int a[], int i) {
        if (i == a.length - 1)
            return true;
        if (a[i] > a[i + 1])
            return false;
        return isSorted(a, i + 1);
    }

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));
    }
}
