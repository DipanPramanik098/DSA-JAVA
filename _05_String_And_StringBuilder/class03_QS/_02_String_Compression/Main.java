import java.util.*;

public class Main {
    public static String compress(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        char curr = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                count++;
            } else {
                ans.append(curr);
                if (count > 1)
                    ans.append(count);
                curr = s.charAt(i);
                count = 1;
            }
        }

        // append last group
        ans.append(curr);
        if (count > 1)
            ans.append(count);

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(compress(input));
    }
}
