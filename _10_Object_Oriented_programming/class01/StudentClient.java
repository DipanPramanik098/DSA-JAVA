package _10_Object_Oriented_programming.class01;

public class StudentClient {
    public static void main(String[] args) {

        // ArrayList<Integer> ll = new ArrayList<>();
        // ll.add(10);
        // ArrayList<Integer> ll1 = new ArrayList<>();
        // ll1.add(5);
        System.out.println("Hey Bhai log");
        Student s = new Student(); 
        //{s -> reference variable, new Student() -: OBJECT}
        s.name = "Dipan Pramanik";
        s.age = 21;
        s.Intro_Yourself();

        Student s2 = new Student();
        s2.name = "Hunir";
        s2.age = 25;
        s2.Intro_Yourself();

        s.SayHey("Raja");

        
        s2.SayHey("Raja");
        Student.fun();
        // s.fun();
        // s1.fun();
    }
} 