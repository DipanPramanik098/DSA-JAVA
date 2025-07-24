public class _05_PrefixProblem {

  static class Node {
    Node[] children = new Node[26];
    boolean eow = false;
    int freq;

    public Node() {
      for (int i = 0; i < children.length; i++) {
        children[i] = null;
      }
      freq = 1;
    }
  }

  public static Node root = new Node();

  // Insert a word into the Trie and update frequency
  public static void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
      int index = word.charAt(i) - 'a';
      if (curr.children[index] == null) {
        curr.children[index] = new Node();
      } else {
        curr.children[index].freq++;
      }
      curr = curr.children[index];
    }
    curr.eow = true;
  }

  // Find and print the unique prefix for a given word
  public static void findPrefix(String word) {
    Node curr = root;
    StringBuilder prefix = new StringBuilder();

    for (int i = 0; i < word.length(); i++) {
      int index = word.charAt(i) - 'a';
      prefix.append(word.charAt(i));
      if (curr.children[index].freq == 1) {
        System.out.println(word + " -> " + prefix);
        return;
      }
      curr = curr.children[index];
    }
  }

  public static void main(String[] args) {
    String arr[] = { "zebra", "dog", "duck", "dove" };

    // Insert all words
    for (int i = 0; i < arr.length; i++) {
      insert(arr[i]);
    }

    System.out.println("Shortest Unique Prefixes:");
    // Find unique prefixes
    for (int i = 0; i < arr.length; i++) {
      findPrefix(arr[i]);
    }
  }
}
