public class _08_continue {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
