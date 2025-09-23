import java.util.*;

public class Main {

    public static void generatePermutations(char[] chars, boolean[] used, StringBuilder sb, List<String> result) {
        if (sb.length() == chars.length) {
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            // skip used characters
            if (used[i])
                continue;

            // skip duplicates: if the current char is same as previous and previous is not
            // used
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            sb.append(chars[i]);
            generatePermutations(chars, used, sb, result);
            sb.deleteCharAt(sb.length() - 1); // backtrack
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        char[] chars = input.toCharArray();
        Arrays.sort(chars); // sort to handle duplicates & lexicographic order

        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[chars.length];

        generatePermutations(chars, used, new StringBuilder(), result);

        // print all distinct permutations
        for (String s : result) {
            System.out.println(s);
        }
    }
}
