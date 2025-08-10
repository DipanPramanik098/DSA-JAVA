public class _03_DiagonalSum {
    public static int Diagonal(int a[][]) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            // primary diagonal
            sum += a[i][i];
            // secondary diagonal
            if (i != a.length - 1 - i) {
                sum += a[a.length - 1 - i][i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println("Diagonal SUm = " + Diagonal(arr));
    }
}
