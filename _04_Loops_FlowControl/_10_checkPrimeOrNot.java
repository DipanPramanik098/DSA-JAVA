import java.util.*;

public class _10_checkPrimeOrNot {
    public static void main(String[] args) {
        // the numbers which have exactly two factors

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int factor = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factor++;
                if (n / i != i) {
                    factor = factor + 1;
                }
            }
        }
        if (factor == 2) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }
}
