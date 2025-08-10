import java.util.Scanner;

public class _02_TakingInput {
    // print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line after printing all elements
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // Declare an array of size n

        System.out.println("Enter " + n + " elements:");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); // Taking input for each element of the array
        }

        // Display the elements of the array
        System.out.println("The elements in the array are:");
        printArray(arr); // Call the printArray method to display the array elements

    }
}
