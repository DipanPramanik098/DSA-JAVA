
public class _04_comPareTo {
    public static void main(String[] args) {
        String s1 = "dipan";
        String s2 = "depan";

        System.out.println(s1.compareTo(s2));
        System.out.println(mycompareTo(s1, s2));
    }

    public static int mycompareTo(String s1, String s2){
        if(s1 == s2) return 0;

        for(int i=0; i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

}
