import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        sc.nextLine(); // consume newline

        char[][] park = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine().replaceAll(" ", ""); // remove spaces
            for (int j = 0; j < M; j++) {
                park[i][j] = line.charAt(j);
            }
        }

        sc.close();

        int finalStrength = traversePark(N, M, K, S, park);
        if (finalStrength >= K) {
            System.out.println("Yes");
            System.out.println(finalStrength);
        } else {
            System.out.println("No");
        }
    }

    // Function to simulate park traversal
    public static int traversePark(int N, int M, int K, int S, char[][] park) {
        int strength = S;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char cell = park[i][j];

                if (cell == '.') {
                    strength -= 3; // 2 for obstacle +1 for step
                } else if (cell == '*') {
                    strength += 4; // 5 for bean -1 for step
                } else if (cell == '#') {
                    break; // move to next row without losing strength
                }

                if (cell != '#') {
                    if (strength < K)
                        return -1; // failed
                }
            }
        }

        return strength;
    }
}
