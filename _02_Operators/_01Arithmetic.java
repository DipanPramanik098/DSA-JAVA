// package _02_Operators;
public class _01Arithmetic {
    public static void main(String[] args) {
        // Binary Operators
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        // NOTE: modulo
        System.out.println(a%b);

        System.out.println("================================================================");

        // Unary Operator
        a++; //post increment
        System.out.println(a);
        ++a; //pre increment
        a++;
        System.out.println(a);
        a+=10;
        System.out.println(a);


        b--;  // post decrement
        --b;--b; //pre decrement
        System.out.println(b);

        b-=10;
        System.out.println(b);
    }
}
