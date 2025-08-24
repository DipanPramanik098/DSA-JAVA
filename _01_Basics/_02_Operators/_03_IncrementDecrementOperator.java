
public class _03_IncrementDecrementOperator {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Initial value of a: " + a);

        // Post-increment
        System.out.println("a++ = " + (a++)); // use a, then increment
        System.out.println("After a++ → a = " + a);

        // Pre-increment
        System.out.println("++a = " + (++a)); // increment, then use
        System.out.println("After ++a → a = " + a);

        // Post-decrement
        System.out.println("a-- = " + (a--)); // use a, then decrement
        System.out.println("After a-- → a = " + a);

        // Pre-decrement
        System.out.println("--a = " + (--a)); // decrement, then use
        System.out.println("After --a → a = " + a);
    }
}
