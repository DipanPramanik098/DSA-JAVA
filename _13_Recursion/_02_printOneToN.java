

public class _02_printOneToN {
    public static void print(int n){
        // base case 
        if(n==0) return;
        // recursive case
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(10);
    }
}
