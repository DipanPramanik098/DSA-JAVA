import java.util.*;

public class Main {

    // Recursive function to insert '*' between consecutive duplicates
    public static String insertStar(String str) {
        // Base case: if string length is 0 or 1, return it as is
        if (str.length() <= 1) {
            return str;
        }

        // Check first two characters
        char first = str.charAt(0);
        char second = str.charAt(1);

        // If they are the same, add '*' between them
        if (first == second) {
            return first + "*" + insertStar(str.substring(1));
        } else {
            return first + insertStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(insertStar(str));
    }
}
