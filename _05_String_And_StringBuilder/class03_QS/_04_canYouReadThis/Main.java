import java.util.*;

public class Main {

    // Function to split Camel Case string into words
    public static List<String> splitCamelCase(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If uppercase and not the first character -> new word
            if (Character.isUpperCase(c) && word.length() > 0) {
                words.add(word.toString());
                word.setLength(0); // reset StringBuilder
            }

            word.append(c);
        }

        // add last word
        if (word.length() > 0) {
            words.add(word.toString());
        }

        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<String> result = splitCamelCase(s);

        // Print each word on a new line
        for (String w : result) {
            System.out.println(w);
        }
    }
}
