import java.util.*;

public class Main {
    public static char mostFrequentChar(String s) {
        int[] freq = new int[256]; // Array to count all ASCII characters

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        // Find maximum frequency character
        int maxFreq = 0;
        char maxChar = s.charAt(0);

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(mostFrequentChar(s));
    }
}
