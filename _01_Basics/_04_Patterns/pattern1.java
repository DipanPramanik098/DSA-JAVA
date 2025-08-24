import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int row = 1;
        while(row <= n){
            int star = 1;
            while(star <= n){
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
        }
    }
}
