
public class _01_Arithmetic_Operator {
    public static void main(String[] args) {
        int a = 20, b = 6;

        // Addition
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // Subtraction
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // Multiplication
        int product = a * b;
        System.out.println("a * b = " + product);

        // Division
        int quotient = a / b; // Integer division
        System.out.println("a / b = " + quotient);

        // Modulus (Remainder)
        int remainder = a % b;
        System.out.println("a % b = " + remainder);

        // For decimal division
        double div = (double) a / b;
        System.out.println("a / b (decimal) = " + div);
    }
}
