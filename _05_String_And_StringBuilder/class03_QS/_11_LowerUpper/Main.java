import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // Read single character
        sc.close();

        checkCharacter(ch);
    }

    // Function to check type of character
    public static void checkCharacter(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Invalid");
        }
    }
}
