import java.util.*;

public class Main {
    // Function to determine character type
    public static char checkChar(char ch) {
        if (Character.isUpperCase(ch)) {
            return 'U';
        } else if (Character.isLowerCase(ch)) {
            return 'L';
        } else {
            return 'I';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // take single character input
        sc.close();

        char result = checkChar(ch); // call function
        System.out.println(result); // print result
    }
}