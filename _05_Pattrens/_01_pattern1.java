public class _01_pattern1 {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // outer loop for number of line
        for(int i=1; i<=4; i++){
            // inner loop for *'s
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
