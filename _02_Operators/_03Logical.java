public class _03Logical {
    public static void main(String[] args) {
        int a = 10 , b= 18;

        System.out.println("a = "+ a + ", b = "+ b);
        // LOGICAL AND &&
        System.out.println("&& "+(a<=b && b<0 ));

        //  logical or ||
        System.out.println("|| "+(a<=b || b>0 ));

        // Logical not !
        System.out.println("! "+(!(a<=b)));
    }    
}
