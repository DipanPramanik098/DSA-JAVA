public class _07_ClearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        // Clear bits from 0 to i-1
        int b = (1 << (i + 1)) - 1;
        int bitmask = a| b;

        return n&bitmask;
    }
    public static void main(String[] args) {
        // n=100111010011, i=2, j=7
        // output = 100100000011   
        // decimal
        System.err.println(clearRangeOfBits(10, 2, 4));

    }
}
