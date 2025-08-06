import java.util.Scanner;

public class _03_fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int fst = 0, scnd = 1;
        for (int i = 2; i <= n; i++) {
            int curr = fst + scnd;
            fst = scnd;
            scnd = curr;
        }
        System.out.println(scnd);
    }
}
