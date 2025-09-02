public class _05_performance {

    // Using String (slow)
//     public static void appendWithString(int n) {
//         String s = "";
//         for (int i = 1; i <= n; i++) {
//             s += i; // creates new object every time
//         }
//     }

//     public static void main(String[] args) {
//         int n = 100000;

//         // Test String
//         long start1 = System.currentTimeMillis();
//         appendWithString(n);
//         long end1 = System.currentTimeMillis();
//         System.out.println("Time with String: " + (end1 - start1) + " ms");
//     }
}
