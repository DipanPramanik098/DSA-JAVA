class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Deep copy method (manual way)
    Address copy() {
        return new Address(this.city);
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.address = other.address; // Copies reference, not object
    }

    // Deep Copy Constructor
    Person(Person other, boolean isDeepCopy) {
        this.name = other.name;
        this.address = new Address(other.address.city); // Creates new Address object
    }

    void display() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}

public class _05_shallowANDdeepCopy {
    public static void main(String[] args) {
        Address addr1 = new Address("New York");
        Person p1 = new Person("Alice", addr1);

        // Creating a shallow copy
        Person shallowCopiedPerson = new Person(p1);

        // Creating a deep copy
        Person deepCopiedPerson = new Person(p1, true);

        // Modifying the address in the shallow copy
        shallowCopiedPerson.address.city = "Los Angeles";

        System.out.println("After modifying shallow copy:");
        p1.display();  // Affected due to shared reference
        shallowCopiedPerson.display();

        // Modifying the address in the deep copy
        deepCopiedPerson.address.city = "Chicago";

        System.out.println("\nAfter modifying deep copy:");
        p1.display();  // Unaffected
        deepCopiedPerson.display();
    }
}

