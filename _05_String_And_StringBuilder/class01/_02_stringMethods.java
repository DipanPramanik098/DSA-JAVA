public class _02_stringMethods {
    public static void main(String[] args) {
        // String Declaration
        String str = "  Java Programming  ";
        String str2 = "java programming";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 5: " + str.charAt(5));

        // 3. substring()
        System.out.println("Substring (0,4): " + str.substring(0, 4));

        // 4. equals() and equalsIgnoreCase()
        System.out.println("Equals str2? " + str.equals(str2));
        System.out.println("EqualsIgnoreCase str2? " + str.trim().equalsIgnoreCase(str2));

        // 5. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 6. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 7. replace()
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));

        // 8. contains()
        System.out.println("Contains 'Pro'? " + str.contains("Pro"));

        // 9. startsWith() and endsWith()
        System.out.println("Starts with '  Ja'? " + str.startsWith("  Ja"));
        System.out.println("Ends with 'ing  '? " + str.endsWith("ing  "));

        // 10. indexOf() and lastIndexOf()
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));

        // 11. split()
        String[] words = str.trim().split(" ");
        System.out.println("Splitting words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 12. concat()
        System.out.println("Concatenation: " + str.trim().concat(" is fun!"));

        // 13. compareTo()
        System.out.println("CompareTo str2: " + str.trim().compareTo(str2));
    }
}
