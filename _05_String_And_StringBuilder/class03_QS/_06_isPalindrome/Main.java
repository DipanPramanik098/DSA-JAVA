import java.util.Scanner;

public class Main {

    // Function to check if string is palindrome
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // no mismatch, palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); // take string input
        sc.close();

        boolean result = isPalindrome(S); // call function
        System.out.println(result); // print result
    }
}
