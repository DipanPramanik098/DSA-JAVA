public class _02_getIthBit {
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0) return 0;
        
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));
    }    
}
