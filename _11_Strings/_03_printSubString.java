
import java.util.Scanner;

public class _03_printSubString {

    public static void printSubString(String s){
    for(int i = 0; i<s.length();i++){
        for(int j = i+1; j<=s.length();j++){
            System.out.println(s.substring(i, j));
        }
    }
};
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        printSubString(s);
    }

}
