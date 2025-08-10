import java.util.Scanner;

public class _01_representation {
    public static boolean search(int arr[][], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == k)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 1.
        int a[][] = new int[3][3];

        // input
        System.out.println("enter 9 values");
        int row = a.length, col = a[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // print
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //
        System.out.println("Enter valur to Search:");
        int k = sc.nextInt();
        System.out.println(search(a, k));

        // 2.
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

    }
}
