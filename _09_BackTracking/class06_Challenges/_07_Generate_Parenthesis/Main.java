import java.util.*;

public class Main {

    // Backtracking function: always generates lexicographic order
    public static void generateParentheses(int n, int open, int close, StringBuilder sb, List<String> result) {
        if (sb.length() == 2 * n) {
            result.add(sb.toString());
            return;
        }

        // Always try '(' first for lexicographic order
        if (open < n) {
            sb.append('(');
            generateParentheses(n, open + 1, close, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(')');
            generateParentheses(n, open, close + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n < 1 || n > 11)
            return; // handle invalid inputs

        List<String> result = new ArrayList<>();
        generateParentheses(n, 0, 0, new StringBuilder(), result);

        // Print directly
        for (String s : result) {
            System.out.println(s);
        }
    }
}
