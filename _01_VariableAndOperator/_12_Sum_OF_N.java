import java.util.Scanner;

public class _12_Sum_OF_N {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while(n>=1){
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }    
}
