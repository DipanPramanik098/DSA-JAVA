
class Parent {
    String message = "Hello from Parent!"; // Parent class variable

    Parent() {
        System.out.println("Parent Constructor Called!");
    }

    void showMessage() {
        System.out.println("Parent Method: " + message);
    }
}

class Child extends Parent {
    String message = "Hello from Child!"; // Child class variable

    Child() {
        super(); // Calls Parent class constructor
        System.out.println("Child Constructor Called!");
    }

    void display() {
        System.out.println("Child Variable: " + message); // Refers to Child class variable
        System.out.println("Parent Variable: " + super.message); // Refers to Parent class variable

        super.showMessage(); // Calls Parent class method
    }
}

public class _18_superKeyword  {
    public static void main(String[] args) {
        Child obj = new Child(); // Creates Child object
        obj.display(); // Calls display method
    }
}
