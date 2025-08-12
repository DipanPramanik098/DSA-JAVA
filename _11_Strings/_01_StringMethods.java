
public class _01_StringMethods {
    public static boolean myOwnEqual(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        if(s1 == s2 ) return true; // address metch
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Dipan";
        String str1 = new String("Dipan");
        String str2 = new String("Dipan");
        String str3 = "Dipan";

        // == compare address not content 
        System.err.println(str == str1); // ye dono pool me  hai so same address hai
        System.err.println(str == str3);
        System.err.println(str1 == str2);

        // to compare content
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str3));
        System.out.println(str1.equals(str2));

        // my Own Equal func
        System.out.println(myOwnEqual(str2, str3));

        System.out.println("======================================================================");
        // substring
        String name = "Dipan Pramanik";
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(2,2));
        System.out.println(name.substring(1));
    }
}
