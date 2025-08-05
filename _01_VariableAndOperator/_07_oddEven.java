import java.util.Scanner;

public class _07_oddEven {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 6) {
			System.out.print("Hello ");
		}
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}
   } 
}
