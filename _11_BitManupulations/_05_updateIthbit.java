public class _05_updateIthbit {
    public static int clearithbit(int n,int i){
        int bitmask = ~(1<<i);

        return n & bitmask;
    }
    public static int updateIthBit(int n, int i, int newbit){
        n = clearithbit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2,1));
    }
}
