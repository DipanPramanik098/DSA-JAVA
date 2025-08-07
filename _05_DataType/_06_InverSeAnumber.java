import java.util.Scanner;

public class _06_InverSeAnumber {

    // example - 1234
    // inverse - 2143       
    // 1 is at position 2, 2 is at position 1, 3 is at position 4, 4 is at position 3
    // inverse = 2 * 10^1 + 1 * 10^0
    // inverse = 2 * 10^1 + 1 * 10^0 + 4 * 10^3 + 3 * 10^2
    // inverse = 2143
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Input the number
        int inverse = 0; // Variable to store the inverse
        int position = 1; // Position of the digit in the inverse
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            inverse += position * Math.pow(10, digit - 1); // Place the digit in its inverse position
            num /= 10; // Remove the last digit
            position++; // Move to the next position
        }
        System.out.println(inverse); // Output the inverse number
        sc.close(); // Close the scanner
    }    
}
