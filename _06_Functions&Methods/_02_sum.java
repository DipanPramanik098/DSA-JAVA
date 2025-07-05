import java.util.*;
public class _02_sum {
    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) { // formal parameter
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num :");
        int a = sc.nextInt();
        System.out.println("Enter second num :");
        int b = sc.nextInt();

        System.out.println("sum = "+sum(a,b)); //arguments or actual parameters
    }    
}
