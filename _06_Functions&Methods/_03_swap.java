
public class _03_swap {
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Before swapping a and b = "+a+" "+b);
        swap(a,b);
        System.out.println("after swapping a and b = "+a+" "+b);
        // note: java follow only call by value so no swapping occured
    }    
}
