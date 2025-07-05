public class _10_BinaryToDecimal {
    public static int BinaryToDecimal(int n){
        int decimal = 0;
        int i = 0;
        while(n>0){
            // lastdigit
            int ld = n%10;
            decimal = (int) (decimal + (ld*Math.pow(2, i)));
            i++;
            n/=10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int n = 10101;
        System.out.println(BinaryToDecimal(n));
    }    
}
