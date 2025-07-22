import java.util.*;

public class _07_validAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> mp = new HashMap<>();

        // Count characters in string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Subtract counts using characters from t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!mp.containsKey(ch))
                return false;

            mp.put(ch, mp.get(ch) - 1);

            if (mp.get(ch) == 0) {
                mp.remove(ch); // Clean up key if count is 0
            }
        }

        return mp.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        String s3 = "hello";
        String s4 = "world";

        System.out.println("Is 'listen' an anagram of 'silent'? " + isAnagram(s1, s2)); // true
        System.out.println("Is 'hello' an anagram of 'world'? " + isAnagram(s3, s4)); // false
    }
}
