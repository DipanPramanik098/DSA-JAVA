
public class _01_print5to1 {
    public static void printD(int n){
        // todo: base case
        if(n<=0) return;
        // todo: work
        System.out.println(n);
        // todo: recursive call
        printD(n-1);
    }
    public static void main(String[] args) {
        int n = 5;

        printD(5);
    }    
}
