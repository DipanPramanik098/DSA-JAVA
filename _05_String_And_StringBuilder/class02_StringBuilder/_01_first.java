package _05_String_And_StringBuilder.class02_StringBuilder;
public class _01_first {
    // Using String (slow)
    public static void appendWithString(int n) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            s += i; // creates new object every time
        }
    }

    // Using StringBuilder (fast)
    public static void appendWithStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i); // modifies same object
        }
    }

    public static void main(String[] args) {
        int n = 100000;

        // Test String
        long start1 = System.currentTimeMillis();
        appendWithString(n);
        long end1 = System.currentTimeMillis();
        System.out.println("Time with String: " + (end1 - start1) + " ms");

        // Test StringBuilder
        long start2 = System.currentTimeMillis();
        appendWithStringBuilder(n);
        long end2 = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end2 - start2) + " ms");
    }  
}
