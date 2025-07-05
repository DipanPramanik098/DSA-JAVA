class Outer {
    static class Nested {
        void show() {
            System.out.println("Static nested class method");
        }
    }
}

public class _17_staticClass {
    public static void main(String[] args) {
        Outer.Nested obj = new Outer.Nested(); // No need to create an instance of Outer
        obj.show(); // Output: Static nested class method
    }
}
