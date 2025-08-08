import java.util.Scanner;

public class _03_ArmstrongNumber {
    public static boolean armStrongNum(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum; // Check if the sum of the digits raised to the power of number of digits equals the original number
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(armStrongNum(num) ? num + " is an Armstrong number." : num + " is not an Armstrong number.");
    }
}
