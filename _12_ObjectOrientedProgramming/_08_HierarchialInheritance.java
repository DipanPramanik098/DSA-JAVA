class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child1 extends Parent {
    void showChild1() {
        System.out.println("Child1 method");
    }
}

class Child2 extends Parent {
    void showChild2() {
        System.out.println("Child2 method");
    }
}

public class _08_HierarchialInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.show();       // Parent method
        c1.showChild1(); // Child1 method
        
        c2.show();       // Parent method
        c2.showChild2(); // Child2 method
    }
}


