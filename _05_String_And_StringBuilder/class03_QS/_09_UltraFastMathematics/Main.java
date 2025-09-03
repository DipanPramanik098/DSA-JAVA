import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            String result = binaryXOR(str1, str2); // call function
            System.out.println(result);
        }

        sc.close();
    }

    // Function to calculate binary XOR of two strings
    public static String binaryXOR(String a, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }
}
