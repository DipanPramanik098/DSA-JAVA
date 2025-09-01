import java.util.Scanner;

public class _02_taking_input {

    // Method to take input for a 2D array
    public int[][] takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr; // Return the filled array
    }

    // Method to print a 2D array
    public void print2DArray(int[][] arr) {
        System.out.println("\nPrinting 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        _02_taking_input obj = new _02_taking_input();

        // Take input from user
        int[][] userArray = obj.takeInput();

        // Print the array
        obj.print2DArray(userArray);

        // Example: Access and update
        if (userArray.length > 0 && userArray[0].length > 0) {
            System.out.println("\nOriginal first element: " + userArray[0][0]);
            userArray[0][0] = 999;
            System.out.println("Updated first element: " + userArray[0][0]);
        }
    }
}
