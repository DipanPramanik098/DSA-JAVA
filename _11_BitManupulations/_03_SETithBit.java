public class _03_SETithBit {
    public static int setithBit(int num, int i) {
        int mask = 1 << i;
        return num | mask;
    }
    public static void main(String[] args) {
        System.out.println(setithBit(10,2));
    }
}
