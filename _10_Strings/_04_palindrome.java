public class _04_palindrome {
    public static boolean palindrome(String s){
        int start = 0, end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;

            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "dipan";

        System.out.println(palindrome(str1));
        System.out.println(palindrome(str2));
    }
}
