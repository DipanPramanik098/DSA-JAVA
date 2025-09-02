import java.util.Scanner;

public class _01_first {
    public static void main(String[] args) {
        System.out.println("String Started");

        // 1. Declare a string
        String name = "Dipan";
        System.out.println("Predefined Name: " + name);

        // 2. Take input
        Scanner sc = new Scanner(System.in);

        // Taking one word (stops at space)
        System.out.print("Enter your first name: ");
        String firstName = sc.next();

        // Taking full line (with spaces)
        System.out.print("Enter your full name: ");
        sc.nextLine(); // consume leftover newline
        String fullName = sc.nextLine();

        System.out.println("First Name: " + firstName);
        System.out.println("Full Name: " + fullName);

        sc.close();
    }
}
