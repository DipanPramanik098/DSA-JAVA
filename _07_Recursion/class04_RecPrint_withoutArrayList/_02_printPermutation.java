
public class _02_printPermutation {
    public static void printP(String s, String ans){
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            String remain = s.substring(0,i) + s.substring(i+1);
            printP(remain, s.charAt(i)+ans);
        }
    }
    public static void main(String[] args) {
        printP("abc", "");
    }    
}
