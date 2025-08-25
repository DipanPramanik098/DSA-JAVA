import java.util.*;

public class _06_Chewbacca_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(Chewbacca(n));
    }

    public static long Chewbacca(long n) {
        String num = Long.toString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            // Only change if digit >= 5
            if (digit >= 5) {
                digit = 9 - digit;
            }

            // First digit must not be zero
            if (i == 0 && digit == 0) {
                digit = num.charAt(i) - '0';
            }

            sb.append(digit);
        }

        return Long.parseLong(sb.toString());
    }
}
