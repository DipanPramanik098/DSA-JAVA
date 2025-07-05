class A {
    void methodA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Class B method");
    }
}

class C extends B {
    void methodC() {
        System.out.println("Class C method");
    }
}

public class _07_multilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); // Inherited from A
        obj.methodB(); // Inherited from B
        obj.methodC(); // Defined in C
    }
}

