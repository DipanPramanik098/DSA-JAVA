import java.util.ArrayList;
import java.util.List;

public class _04_CombinationSumm_3 {

    // https://leetcode.com/problems/combination-sum-iii/
    public static void Permutation(int k, int n, int curr, List<Integer> ll, List<List<Integer>> ans){
        if(n == 0 && ll.size() == k) {
            ans.add(new ArrayList<Integer>(ll));
            return;
        }
        if(ll.size() > k || n<0) return;
        for(int i=curr; i<=9; i++){
            if(n >= i){
                ll.add(i);
                Permutation(k, n-i, i + 1, ll, ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Permutation(k, n, 1,  ll, ans);
        return ans;
    }

    public static void main(String[] args) {
        
        // Example test cases
        System.out.println("k = 3, n = 7 → " + combinationSum3(3, 7));
        System.out.println("k = 3, n = 9 → " + combinationSum3(3, 9));
        System.out.println("k = 4, n = 1 → " + combinationSum3(4, 1));
        System.out.println("k = 3, n = 15 → " + combinationSum3(3, 15));
    }

}
