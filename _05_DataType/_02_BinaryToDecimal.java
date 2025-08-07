import java.util.Scanner;

public class _02_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int mul = 1;
        while(n > 0) {
            int rem = n % 10; // Get the last digit
            sum = sum + (rem * mul); // Add to sum with appropriate multiplier
            n = n / 10; // Remove the last digit
            mul *= 2; // Update multiplier for next binary digit
        }
        System.out.println(sum); // Output the decimal equivalent+
    }    
}
