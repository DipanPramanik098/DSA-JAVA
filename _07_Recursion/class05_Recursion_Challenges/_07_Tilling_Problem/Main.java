import java.util.*;
public class Main {
    static final int MOD = 1000000007;
    static final int MAX = 100000;
    static long[] fact = new long[MAX + 1];
    static long[] invFact = new long[MAX + 1];

    // Fast power
    static long powMod(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    // nCr modulo
    static long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return (((fact[n] * invFact[r]) % MOD) * invFact[n - r]) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // Precompute factorials
        fact[0] = 1;
        for (int i = 1; i <= MAX; i++) fact[i] = (fact[i-1] * i) % MOD;
        invFact[MAX] = powMod(fact[MAX], MOD - 2);
        for (int i = MAX-1; i >= 0; i--) invFact[i] = (invFact[i+1] * (i+1)) % MOD;

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long ans = 0;

            // sum over k
            for (int k = 0; k * m <= n; k++) {
                ans = (ans + nCr(n - (m-1)*k, k)) % MOD;
            }

            System.out.println(ans);
        }
    }
}
