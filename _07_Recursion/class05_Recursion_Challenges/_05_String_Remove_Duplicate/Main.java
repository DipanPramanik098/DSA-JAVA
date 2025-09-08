import java.util.*;

public class Main {

    // Recursive function to remove consecutive duplicates
    public static String removeConsecutiveDuplicates(String str) {
        // Base case: if string length is 0 or 1, return it as is
        if (str.length() <= 1) {
            return str;
        }

        // Compare first two characters
        char first = str.charAt(0);
        char second = str.charAt(1);

        if (first == second) {
            // Skip the first character and recurse on the rest
            return removeConsecutiveDuplicates(str.substring(1));
        } else {
            // Keep first character and recurse on the rest
            return first + removeConsecutiveDuplicates(str.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(removeConsecutiveDuplicates(str));
    }
}
