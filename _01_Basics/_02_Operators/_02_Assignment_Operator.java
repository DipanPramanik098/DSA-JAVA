
public class _02_Assignment_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b;

        // Simple assignment
        b = a;
        System.out.println("b = a → b = " + b);

        // Add and assign
        b += 5; // b = b + 5
        System.out.println("b += 5 → b = " + b);

        // Subtract and assign
        b -= 3; // b = b - 3
        System.out.println("b -= 3 → b = " + b);

        // Multiply and assign
        b *= 2; // b = b * 2
        System.out.println("b *= 2 → b = " + b);

        // Divide and assign
        b /= 4; // b = b / 4
        System.out.println("b /= 4 → b = " + b);

        // Modulus and assign
        b %= 3; // b = b % 3
        System.out.println("b %= 3 → b = " + b);
    }
}
