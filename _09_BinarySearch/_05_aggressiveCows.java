import java.util.Arrays;
import java.util.Scanner;

public class _05_aggressiveCows {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt(); // no of stalls
        int noc = sc.nextInt(); // no of cows

        int[] stall = new int[nos];
        for (int i = 0; i < nos; i++) {
            stall[i] = sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(MinDistance(stall, noc));
    }

    public static int MinDistance(int[] stall, int noc) {
        int lo = 1; // min possible distance
        int hi = stall[stall.length - 1] - stall[0]; // max possible distance
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(stall, noc, mid)) {
                ans = mid;      // try for a bigger distance
                lo = mid + 1;
            } else {
                hi = mid - 1;   // try for a smaller distance
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] stall, int noc, int distance) {
        int pos = stall[0];
        int cowCount = 1; // first cow placed

        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - pos >= distance) {
                pos = stall[i];
                cowCount++;
                if (cowCount == noc)
                    return true;
            }
        }
        return false;
    }
}
