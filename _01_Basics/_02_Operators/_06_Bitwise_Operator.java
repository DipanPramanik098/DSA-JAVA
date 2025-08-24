
public class _06_Bitwise_Operator {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        System.out.println("a & b  = " + (a & b)); // AND
        System.out.println("a | b  = " + (a | b)); // OR
        System.out.println("a ^ b  = " + (a ^ b)); // XOR
        System.out.println("~a     = " + (~a)); // NOT
        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
    }
}
