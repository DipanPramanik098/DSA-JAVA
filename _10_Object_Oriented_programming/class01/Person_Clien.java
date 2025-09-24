package _10_Object_Oriented_programming.class01;

public class Person_Clien {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("hey");
        // Person p1 = new Person();
        Person p = new Person(19, "Smridhi");
        Person p1 = new Person(19, "Mohini");
        p.Intro_yourSelf();
        // constructor
        // Car c = new Car("Red", 801, 9);
        // c.color="black";
    }
}
