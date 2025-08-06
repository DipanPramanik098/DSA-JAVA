import java.util.Scanner;

public class _02_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                fact++;
                if(n/i != i) fact++;
            }
        }
        System.out.println(fact==2);
    }    
}
