public class _11_stringCompression {
    public static String compress(String s){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int count = 1; // Use primitive int instead of Integer

            while ((i < s.length() - 1) && (s.charAt(i) == s.charAt(i + 1))) {
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if (count > 1) {
                sb.append(count); // No need for count.toString()
            }
        }
        return sb.toString();

        // O(n)
    }
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        // output =>>>>> "a3b2c3d2"
        System.out.println(compress(s));

    }
}
