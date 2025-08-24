
public class _05_LogicalOperator {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x = " + x + ", y = " + y);

        // Logical AND
        System.out.println("x && y : " + (x && y));

        // Logical OR
        System.out.println("x || y : " + (x || y));

        // Logical NOT
        System.out.println("!x     : " + (!x));
        System.out.println("!y     : " + (!y));

        // Combined example
        int a = 10, b = 20, c = 30;
        System.out.println("(a < b) && (b < c) : " + ((a < b) && (b < c)));
        System.out.println("(a > b) || (b < c) : " + ((a > b) || (b < c)));
    }
}
