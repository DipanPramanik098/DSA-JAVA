import java.util.Scanner;

public class _07_ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        int revNum = 0;
        while(n>0){
            int lastDigit = n%10;
            revNum= revNum*10 + lastDigit;
            n/=10;
        }
        System.out.println("Reverse Number = " + revNum);
    }   
}
