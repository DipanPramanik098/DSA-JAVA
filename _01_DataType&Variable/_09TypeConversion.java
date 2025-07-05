public class _09TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        long b = a;
        System.out.println(b);

        long l = 12;
        int x = l; //this line throw an Error because size of int < size of long
        System.out.println(x);

        
    }
}
