public class _05_printLengthWisesubstring {
    public static void printLengthWise(String s){
        for(int length = 1;
         length <= s.length(); length++){
            for(int j = length; j<=s.length(); j++){
                int i = j - length;
                System.out.println(s.substring(i, j));
            }
         }
    }
    public static void main(String[] args) {
        String str = "84513";
        printLengthWise(str);
    }
}
