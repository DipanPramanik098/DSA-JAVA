public class _07_ternaryOperator {
    public static void main(String[] args) {
        // variable = condition? statement1 : statement2;

        // Note: check even odd

        int num = 66;

        String type = (num%2==0)?"Even" : "odd";

        System.out.println(type);
    }
}
