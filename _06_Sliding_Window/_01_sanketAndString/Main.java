import java.util.*;

public class Main {
    public static int solve(String s, int k, char target) {
        int left = 0;
        int maxLen = 0;
        int changes = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != target)
                changes++;

            while (changes > k) {
                if (s.charAt(left) != target)
                    changes--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        int ans = Math.max(solve(s, k, 'a'),
                solve(s, k, 'b'));

        System.out.println(ans);
    }
}