public class _04_elseIf {
    public static void main(String[] args) {
        int age = 18;

        if(age >= 18){
            System.out.println("Ypu are adult.");
        }
        else if(age>13 && age<18) {
            System.out.println("Teenager");
        }else if(age<0) {
            System.out.println("Invalid age.");
        }else {
            System.out.println("child");
        }
    }
}
