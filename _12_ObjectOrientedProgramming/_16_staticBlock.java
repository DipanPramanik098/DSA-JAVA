
class Test {
    static int x;

    static {
        x = 10;
        System.out.println("Static block executed. x = " + x);
    }
}

public class _16_staticBlock {
    public static void main(String[] args) {
        System.out.println("Main method executed");
        Test obj = new Test(); // Static block runs only once
    }
}
