public class _08_prime {
    public static boolean prime(int n){
        int factor = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factor++;
                if (n / i != i) {
                    factor = factor + 1;
                }
            }
        }
        if(factor == 2) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 17;
        int n2 = 12;

        System.out.println(prime(n));
        System.out.println(prime(n2));
    }
}
