import java.util.Scanner;

public class _08_breakExample {
    public static void main(String[] args) {
        // keep entering numbers till user enters a multiple of 10

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter any number...");
            int n = sc.nextInt();

            if(n%10 == 0){
                System.out.println("You Entered a multiple of 10! Exit!");
                break;
            }
        }
    }    
}
