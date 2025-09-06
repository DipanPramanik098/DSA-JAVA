import java.util.ArrayList;

public class _02_Permutation {
    // note: For string of length n, total permutations = n!

    // Recursive method to return all permutations of a string
    public static ArrayList<String> permutation(String s) {
        // ✅ Base case: when input string is empty
        if (s.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add(""); // Only 1 permutation of empty string
            return base;
        }

        // Step 1: Extract first character
        char ch = s.charAt(0);
        String ros = s.substring(1); // rest of string

        // Step 2: Recursively get permutations of rest of string
        ArrayList<String> recR = permutation(ros);

        // Step 3: For each result, insert current character at all positions
        ArrayList<String> myRes = new ArrayList<>();
        for (String rrs : recR) {
            for (int i = 0; i <= rrs.length(); i++) {
                // Insert ch at position i in rrs
                String val = rrs.substring(0, i) + ch + rrs.substring(i);
                myRes.add(val);
            }
        }

        return myRes;
    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> result = permutation(s);

        for (String str : result) {
            System.out.println(str);
        }
    }
}
