class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class overriding the sound method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class overriding the sound method
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class _10_methodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Parent class reference, Child class object
        myAnimal.sound(); // Calls the overridden method in Dog class

        myAnimal = new Cat(); // Now referencing Cat class
        myAnimal.sound(); // Calls the overridden method in Cat class
    }
}
