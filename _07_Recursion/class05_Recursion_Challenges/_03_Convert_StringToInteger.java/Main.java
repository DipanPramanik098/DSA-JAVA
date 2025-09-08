import java.util.*;

public class Main {

    // Recursive function to convert string to integer
    public static int stringToInt(String str, int index) {
        // Base case: if we've processed the last character
        if (index == str.length()) {
            return 0;
        }

        // Get integer value of current character
        int digit = str.charAt(index) - '0';

        // Recurse for the rest of the string
        int remaining = stringToInt(str, index + 1);

        // Multiply digit by the appropriate power of 10
        int power = str.length() - index - 1;
        return digit * (int) Math.pow(10, power) + remaining;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(stringToInt(str, 0));
    }
}
