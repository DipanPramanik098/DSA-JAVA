
class Student {
    static String schoolName = "ABC High School"; // Static variable
    String studentName;

    Student(String name) {
        this.studentName = name;
    }

    void display() {
        System.out.println(studentName + " studies at " + schoolName);
    }
}

public class _14_static_variable{
    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Emma");

        s1.display(); // Output: John studies at ABC High School
        s2.display(); // Output: Emma studies at ABC High School

        // Changing static variable
        Student.schoolName = "XYZ Academy";
        s1.display(); // Output: John studies at XYZ Academy
        s2.display(); // Output: Emma studies at XYZ Academy
    }
}
