import java.util.Scanner;

public class _04_spiralPrint {

    // Function to print a 2D array in spiral order without using ArrayList
    public static void spiralPrint(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        System.out.println("\nSpiral Print of the array:");

        while (top <= bottom && left <= right) {
            // 1️⃣ Print top row
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // 2️⃣ Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // 3️⃣ Print bottom row (if still remaining)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // 4️⃣ Print left column (if still remaining)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Call spiral print function
        spiralPrint(arr);

        sc.close();
    }
}
