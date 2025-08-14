public class _03_qs {
    public static void main(String[] args) {
        String s = "aaaababaabbabaa";
        int k = 2;

        int flip_a = maxLen(s, 'a', k);
        int flip_b = maxLen(s, 'b', k);

        System.out.println(Math.max(flip_a, flip_b)); // Output: 4
    }

    public static int maxLen(String s, char ch, int k) {
        int si = 0, ei = 0;
        int ans = 0;
        int flip = 0;

        while (ei < s.length()) {
            // grow window
            if (s.charAt(ei) != ch) {
                flip++;
            }

            // shrink window if flips exceed k
            while (flip > k && si <= ei) {
                if (s.charAt(si) != ch) {
                    flip--;
                }
                si++;
            }

            // update answer
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}
