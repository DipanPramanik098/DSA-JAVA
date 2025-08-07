
public class _04_typeCasting {
    public static void main(String[] args) {
        // 🔹 Implicit Typecasting (Widening) - Automatically done by compiler
        int intVal = 100;
        long longVal = intVal; // int → long (safe)
        float floatVal = longVal; // long → float
        double doubleVal = floatVal; // float → double

        System.out.println("🔹 Implicit Typecasting (Widening):");
        System.out.println("int to long: " + longVal); // 100
        System.out.println("long to float: " + floatVal); // 100.0
        System.out.println("float to double: " + doubleVal); // 100.0
        System.out.println();

        // 🔸 Explicit Typecasting (Narrowing) - Manually done by developer
        double d = 99.99;
        float f = (float) d; // double → float
        long l = (long) f; // float → long (decimal dropped)
        int i = (int) l; // long → int
        char ch = (char) i; // int → char (ASCII character)
        byte b = (byte) i; // int → byte (may overflow)

        System.out.println("🔸 Explicit Typecasting (Narrowing):");
        System.out.println("double to float: " + f); // 99.99
        System.out.println("float to long: " + l); // 99
        System.out.println("long to int: " + i); // 99
        System.out.println("int to char: " + ch); // 'c' (ASCII 99)
        System.out.println("int to byte: " + b); // 99 (no overflow)
        System.out.println();

        // ⚠️ Overflow Example
        int overflowExample = 258;
        byte overflowByte = (byte) overflowExample; // byte range -128 to 127
        System.out.println("⚠️ Overflow in byte casting:");
        System.out.println("int 258 to byte: " + overflowByte); // Output: 2
        System.out.println();

        // ➗ Expression Casting Example
        int a = 5, b2 = 2;
        int result1 = a / b2; // Integer division (truncates)
        double result2 = (double) a / b2; // One operand casted → floating-point

        System.out.println("➗ Expression Typecasting:");
        System.out.println("5 / 2 without casting: " + result1); // 2
        System.out.println("5 / 2 with casting: " + result2); // 2.5
    }
}
