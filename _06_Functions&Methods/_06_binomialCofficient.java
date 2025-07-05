public class _06_binomialCofficient {
    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
    //  nCr = n!/(r!*(n-r)!)  // 
    int n = 12;
    int r = 7;

    System.out.println("nCr = "+(fact(n)/(fact(r)*fact(n-r))));
    }    
}
