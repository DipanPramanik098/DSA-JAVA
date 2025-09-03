import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of string (not really needed)
        String s = sc.next(); // input string of digits

        sc.close();

        System.out.println(findMaxCBNumbers(s));
    }

    // Function to find maximum number of CB numbers
    public static int findMaxCBNumbers(String s) {
        int count = 0;
        boolean[] visited = new boolean[s.length()];

        // Generate substrings of all lengths
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String sub = s.substring(i, j);
                long num = Long.parseLong(sub);

                if (isCBNumber(num) && isValid(visited, i, j)) {
                    count++;
                    // Mark this substring as visited
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        return count;
    }

    // Check if any digit of substring is already used
    public static boolean isValid(boolean[] visited, int start, int end) {
        for (int i = start; i < end; i++) {
            if (visited[i])
                return false;
        }
        return true;
    }

    // Check if a number is CB number
    public static boolean isCBNumber(long num) {
        if (num == 0 || num == 1)
            return false;

        int[] cbPrimes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

        for (int prime : cbPrimes) {
            if (num == prime)
                return true; // number is in CB prime list
        }

        for (int prime : cbPrimes) {
            if (num % prime == 0)
                return false; // divisible → not CB
        }

        return true; // not divisible by any → CB number
    }
}
