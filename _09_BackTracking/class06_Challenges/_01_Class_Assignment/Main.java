import java.util.*;

public class Main {
    public static int count(int n, int pos, char prev, String ans) {
        if (pos == n)
            return 1;
        if (pos > n)
            return 0;
        int count = 0;
        count += count(n, pos + 1, 'a', ans + "a");

        if (prev != 'b') {
            count += count(n, pos + 1, 'b', ans + "b");
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int inputVal[] = new int[T];
        for (int i = 0; i < T; i++) {
            inputVal[i] = sc.nextInt();
        }

        for (int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " : " + count(inputVal[i], 0, '#', ""));
        }
    }
}