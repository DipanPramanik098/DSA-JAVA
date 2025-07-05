public class _09_stringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        // O(26)  -- O(1)
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());
    }
}
