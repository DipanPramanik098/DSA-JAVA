public class _02_PowerOf_x_n {
    // O(logn)
    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        int pnb2 = Power(x, n/2);
        if(n%2 == 1){
            return pnb2 * pnb2 * x;
        } else {
            return pnb2 * pnb2;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Power(x, n));   
    }
}
