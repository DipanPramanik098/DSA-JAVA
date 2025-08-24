public class _05_print_prime_factor {
    public static void main(String[] args) {
        int n = 378;
        for (int i = 2; i <= n;) {
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
            } else {
                i++;
            }
        }
    }
}
