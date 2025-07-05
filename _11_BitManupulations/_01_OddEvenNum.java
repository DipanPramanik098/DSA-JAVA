public class _01_OddEvenNum {
    public static void main(String[] args) {
        int n = 7;

        // using bit manupulation -(bitwise &)
        if((n&1) !=1){
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+" is Odd");
        }
    }
}
