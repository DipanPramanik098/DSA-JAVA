public class _11_FriendsPairing {
    public static int friendsPairing(int n){
        // base case
        if(n==1 || n==2) return n;

        // choices
            // single
            int single = friendsPairing(n-1);
            // pair with any of n-1 friend
            int pair = friendsPairing(n-2) * (n-1);
        // return the sum of both
        return single + pair;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
