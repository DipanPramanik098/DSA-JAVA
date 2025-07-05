class MathOperations {
    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class _09_methodOverloading {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        
        System.out.println(obj.add(5, 10));        // Calls method with two integers
        System.out.println(obj.add(5, 10, 15));    // Calls method with three integers
        System.out.println(obj.add(5.5, 2.2));     // Calls method with doubles
    }
}
