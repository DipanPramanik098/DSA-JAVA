public class _07_countUniqueSubString {
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
    Node curr = root;
    for (int level = 0; level < word.length(); level++) {
      int index = word.charAt(level) - 'a';
      if (curr.children[index] == null) {
        curr.children[index] = new Node();
      }
      curr = curr.children[index];
    }
    curr.eow = true;
  }

  // Function to count all nodes (each node represents a unique substring path)
  public static int countNodes(Node root) {
    if (root == null)
      return 0;

    int count = 0;
    for (int i = 0; i < 26; i++) {
      if (root.children[i] != null) {
        count += countNodes(root.children[i]);
      }
    }
    return count + 1; // +1 for the current node
  }

  public static void main(String[] args) {
    String s = "ababa";

    // Insert all suffixes of the string into the Trie
    for (int i = 0; i < s.length(); i++) {
      insert(s.substring(i));
    }

    // Count all unique substrings
    int totalNodes = countNodes(root); // includes root node

    System.out.println("Total unique substrings = " + totalNodes);
  }
}
