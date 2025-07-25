import java.util.Scanner;

public class _09_SwitchStatement {
    public static void main(String[] args) {
        // Calculator using Switch Case

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println("a+b = " +(a+b));
            break;
            case '-' : System.out.println("a-b = "+(a-b));
            break;
            case '*' : System.out.println("a*b = " +(a*b));
            break;
            case '/' : System.out.println("a/b = " +(a/b));
            break;
            case '%' : System.out.println("a%b = "+(a%b));
            break;
            default : System.out.println("This is a basic Calculator");
        }

    }
}
