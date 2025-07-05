public class _11_DecimalToBinary {
    public static int DecimalToBinary(int n){
        int binary = 0;
        int i=0;
        while(n>0){
            int remainder = n%2;
            binary = (int) (binary + remainder*Math.pow(10,i));
            i++; 
            n/=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(DecimalToBinary(n));
    }    
}
