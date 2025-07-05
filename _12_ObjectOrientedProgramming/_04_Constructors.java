
public class _04_Constructors {
    public static void main(String[] args) {
        Student s= new Student();
        s.name = "Dipan";
        s.age = 20;
        s.gender = "Male";

        Student s2 = new Student(s1);
    }    
}
class Student{
    String name;
    int age;
    String gender;
    Student(){
        System.out.println("Constructor called");
    }
    // Parameterized Constructor
    Student(String name){
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }

    // copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.gender = s.gender;
    }
}
