

public class _01_printAllSubsequence {
    public static void printSS(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char curr = str.charAt(0);
        String ros = str.substring(1);
        // todo: exclude
        printSS(ros, ans);
        // todo: include
        printSS(ros,curr+ans);
    }
    public static void main(String[] args) {
        printSS("abc", "");
    }
}
