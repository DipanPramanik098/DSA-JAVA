public class _06_clearLastIbits {

    public static int solve(int n, int i){
        int bitmask = (~0) << i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        // n =1111 i=2   output = 1100 = 12

        int n = 15;

        System.out.println(solve(n, 2));

    }
}
