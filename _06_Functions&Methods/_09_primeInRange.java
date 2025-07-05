public class _09_primeInRange {
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
        int start = 12;
        int end = 87;
        for(int i=start; i<=end; i++){
            if(prime(i)) {
                System.out.println(i);
            }
        }
    }    
}
