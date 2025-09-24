package _10_Object_Oriented_programming.class01;

public class Student {
    String name; //note: class ka data member / variable
    int age;
    // non static method
    public void Intro_Yourself(){ //class ka method
        System.out.println("My Name is : "+ this.name +". and Age is : "+ this.age);
    }

    public void SayHey(String name) {
        fun();
        System.out.println(name + " say hey " + this.name);

    }

    public static void fun() {
        // System.out.println(count);

        System.out.println("I am in Fun");
    }

    static {
        System.out.println("Bklol Tinder use nhi krna hai ");
    }
    static {
        System.out.println("Hey All Welcome to CB");
    }
}
