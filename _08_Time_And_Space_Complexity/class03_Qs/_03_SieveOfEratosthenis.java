import java.util.Arrays;
public class _03_SieveOfEratosthenis {

    // Function to run sieve of Eratosthenes
    public static void sieveOfEratosthenes(int n) {
        boolean [] primes = new boolean[n + 1]; //default false

        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;
        for(int table =2; table*table <= n; table++){
            if(primes[table] == true){
                for(int mult = 2; table*mult <= n; mult++){
                    primes[table*mult] = false;
                }
            }
        }
        for(int i = 0; i < primes.length; i++){
            if(primes[i] == true){
                System.out.print(i + " ");
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 50; // Example: find primes up to 50
        sieveOfEratosthenes(n);
    }
}
