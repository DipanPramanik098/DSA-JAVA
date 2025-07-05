import java.util.Scanner;

public class _03_print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }        
    }
}
