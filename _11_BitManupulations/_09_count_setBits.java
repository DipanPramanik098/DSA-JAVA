public class _09_count_setBits {
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0) count++;

            n= n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Numberof 1 in 10's Binary = "+countSetBit(10));
        System.out.println("Numberof 1 in 255's Binary = "+countSetBit(255));
    }
}
