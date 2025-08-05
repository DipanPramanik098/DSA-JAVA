import java.util.Scanner;

public class _08_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("vote dega");
		} else {
			System.out.println("Vote nhi dega");
		}
    }
}
