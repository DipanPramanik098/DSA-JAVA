
interface Animal {
    void makeSound(); // Abstract method (implicitly public and abstract)
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class _13_interface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks
    }
}
