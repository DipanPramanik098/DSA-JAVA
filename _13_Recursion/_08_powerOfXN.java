public class _08_powerOfXN {
    public static int power(int x, int n){
        if(n==0)return 1;

        return x* power(x, n-1);
    }    
    // optimized
    public static int powerOptimized(int x, int n){
        if(n==0)return 1;
        int demo = powerOptimized(x, n/2);

        int ans = demo*demo;
        if(n%2 !=0) {
            ans*=x;
        }
        return ans;
    }    
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(powerOptimized(2,10));
    }
}
