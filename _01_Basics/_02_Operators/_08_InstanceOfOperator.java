class Animal {
}

class Dog extends Animal {
}

public class _08_InstanceOfOperator {
    public static void main(String[] args) {
        Animal obj = new Dog();

        System.out.println(obj instanceof Dog); // true
        System.out.println(obj instanceof Animal); // true
        System.out.println(obj instanceof Object); // true
    }
}
