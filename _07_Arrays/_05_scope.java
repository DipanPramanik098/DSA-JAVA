public class _05_scope {

    public static void main(String[] args) {
        System.out.println("Hey");
        
        int x = 50;
        System.out.println(val);
        fun(x);
        System.out.println(val);
    }
    static int val = 100; // Global variable
    static void fun(int x) {
        int a = 90;
        System.out.println(x);
        System.out.println(val);
        int val =19;
        val = 120;
        System.out.println(val);
        System.out.println(_05_scope.val);
    }
}
