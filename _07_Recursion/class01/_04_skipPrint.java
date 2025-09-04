
public class _04_skipPrint {
    public static void pd(int n){
        if(n<=0) return;
        if(n%2==1) System.out.println(n);
        pd(n-1);
        if(n%2==0) System.out.println(n);
    }
    public static void main(String[] args) {
        pd(5);
    }    
}
