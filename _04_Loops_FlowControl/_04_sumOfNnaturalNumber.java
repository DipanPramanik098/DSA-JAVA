import java.util.Scanner;

public class _04_sumOfNnaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int n = sc.nextInt();
        int i =1;
        int sum = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum = "+sum);
    };
}
