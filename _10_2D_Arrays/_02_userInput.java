import java.util.Scanner;

public class _02_userInput {
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];

        // Input elements into the 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for position [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // 
        System.out.println("The 2D array is:");
        display(arr);
    }
}
