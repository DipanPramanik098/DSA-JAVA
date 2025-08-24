
public class _06_pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;
        int space = n - 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(row + " ");
                j++;
            }
            // next line prep
            System.out.println();
            space--;
            star += 2;
            row++;
        }
    }
}
