
public class _00_string {
    public static void main(String[] args) {
        // inside string pool -heap (no duplicate)
        String str = "Dipan";
        // outside pool - heap (duplicate)
        String str1 = new String("Dipan");
        String str2 = new String("Dipan");
        String str3 = "Dipan";

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str.length());
        System.out.println(str1.length());

        // access value at any index
        System.out.println(str.charAt(2));

        // concatenation
        String s1 = "hlo";
        String s2 = "hi";

        s1 = s1+s2;
        System.out.println(s1);

        // 2
        s1 = s1.concat(str);
        System.out.println(s1);
    }
}
