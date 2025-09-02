
import java.util.Scanner;

public class _03_printChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String name  = sc.nextLine();

        // print Char
        for(int i=0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
