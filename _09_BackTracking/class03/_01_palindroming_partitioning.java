import java.util.ArrayList;
import java.util.List;

public class _01_palindroming_partitioning {
    // check palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void partitioning(String qs, List<String> ll, List<List<String>> ans) {
        if (qs.length() == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 1; i <= qs.length(); i++) {
            String s = qs.substring(0, i);
            if (isPalindrome(s)) {
                ll.add(s); // choose
                partitioning(qs.substring(i), ll, ans); // explore
                ll.remove(ll.size() - 1); //  backtrack (important!)
            }
        }
    }

    public static void main(String[] args) {
        String qs = "aab";

        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        partitioning(qs, ll, ans);

        System.out.println(ans);
    }
}
