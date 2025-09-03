import java.util.*;

public class Main {

    // Function to insert ASCII differences
    public static String insertAsciiDifference(String s) {
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0)); // first character

        for (int i = 0; i < s.length() - 1; i++) {
            int diff = s.charAt(i + 1) - s.charAt(i); // difference
            result.append(diff);
            result.append(s.charAt(i + 1));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = insertAsciiDifference(s);
        System.out.println(ans);
    }
}
