public class _06_startsWithProblem {

  static class Node {
    Node[] children = new Node[26];
    boolean eow = false;

    public Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
    }
  }

  public static Node root = new Node();

  // Insert a word into the Trie
  public static void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
      int index = word.charAt(i) - 'a';
      if (curr.children[index] == null) {
        curr.children[index] = new Node();
      }
      curr = curr.children[index];
    }
    curr.eow = true;
  }

  // Check if any word in Trie starts with the given prefix
  public static boolean startsWith(String prefix) {
    Node curr = root;
    for (int i = 0; i < prefix.length(); i++) {
      int index = prefix.charAt(i) - 'a';
      if (curr.children[index] == null) {
        return false;
      }
      curr = curr.children[index];
    }
    return true;
  }

  public static void main(String[] args) {
    String words[] = { "apple", "app", "mango", "man", "woman" };

    // Insert all words into the Trie
    for (String word : words) {
      insert(word);
    }

    // Test startsWith() with various prefixes
    String[] testPrefixes = { "app", "man", "woman", "moon", "a", "wo", "cat" };

    for (String prefix : testPrefixes) {
      System.out.println("Starts with \"" + prefix + "\"? " + startsWith(prefix));
    }
  }
}
