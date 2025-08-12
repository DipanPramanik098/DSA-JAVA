import java.util.Scanner;

public class _02_palindrome {
    public static boolean isPalindrome(String s){
        int i=0, j= s.length()-1;
        while (i <= j) {
            if(s.charAt(i) != s.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Dipan";
        String s2 = "racecar";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
    }
}
