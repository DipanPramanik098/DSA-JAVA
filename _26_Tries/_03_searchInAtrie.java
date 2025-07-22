public class _03_searchInAtrie {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        word = word.toLowerCase(); // Convert to lowercase

        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            char ch = word.charAt(level);
            if (ch < 'a' || ch > 'z')
                continue; // skip invalid characters

            int index = ch - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        word = word.toLowerCase(); // Convert to lowercase

        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch < 'a' || ch > 'z')
                return false; // invalid character

            int index = ch - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.eow;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("any")); // true
        System.out.println(search("Dipan")); // false (not inserted, safe from error)
        System.out.println(search("The")); // true (case-insensitive now)
    }
}
