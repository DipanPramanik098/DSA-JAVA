class MathUtil {
    static int square(int num) {
        return num * num;
    }
}

public class _15_staticMethods {
    public static void main(String[] args) {
        int result = MathUtil.square(5); // Calling static method without object
        System.out.println("Square: " + result); // Output: Square: 25
    }
}
