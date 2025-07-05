public class _08_checkPowerOfTwo {
    public static boolean powOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(powOfTwo(15));
        System.out.println(powOfTwo(16));
    }
}
