public class _07_subStrings {
    public static String subString(String s, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += s.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "Namaste Duniya";
        // user defined subString function call
        System.out.println(subString(str, 0, 5));

        // In-Build subString function

        // str.substring(0, 5);
        System.out.println(str.substring(0, 5));
    }
}
