import java.util.*;

public class _01_DecimalToBinary {
    /* n = 10 
        sum = 0, mul = 1
        n>0 ✅ rem = 10 % 2 = 0, sum = 0 + (0 * 1) = 0
        n = 10 / 2 = 5, mul = 1 * 10

        n>0 ✅ rem = 5 % 2 = 1, sum = 0 + (1 * 10) = 10
        n = 5 / 2 = 2, mul = 10 * 10

        n>0 ✅ rem = 2 % 2 = 0, sum = 10 + (0 * 100) = 10
        n = 2 / 2 = 1, mul = 100 * 10
        
        n>0 ✅ rem = 1 % 2 = 1, sum = 10 + (1 * 1000) = 1010

        n = 1 / 2 = 0, mul = 1000 * 10
        n>0 ❌

    */  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n % 2;
            sum = sum + (rem*mul);
            n = n / 2;
            mul*=10;
        }
        System.out.println(sum);
    }    
}
