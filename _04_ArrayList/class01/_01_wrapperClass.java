public class _01_wrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        // Long l2 = 60l;
        // long l1 = 89;

        // int b = 89;
        // Integer b1=145;
        // b1 = b;

        // Float f = 19.087f;
        // float f2 = 4.54f;

        // Double d = 8.9;
        // double d2 = 2.3;

        // Byte b6 = 7;
        // Short s = 10;

        // Boolean b21 = true;

        // Character c = 'a';

        int b = 78;
        Integer b1 = 89;

        b1 = b; // Note: Auto Boxing (premitive to Non Premitive.)

        a = a1; // Note: OnBoxing (Non Premitive to Premitive)

        System.out.println(b1);

        Integer c1 = 15;
        Integer c2 = 15;
        Integer c4 = 157; // note out of bound integer -127 to 127
        Integer c5 = 157;
        System.out.println(c1 == c2); // true
        System.out.println(c4 == c5); // false

    }
}
