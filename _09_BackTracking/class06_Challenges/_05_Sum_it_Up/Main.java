import java.util.*;

public class Main {

    public static void findCombinations(int[] nums, int target, int start, List<Integer> temp,
            List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // skip duplicates
            if (i > start && nums[i] == nums[i - 1])
                continue;

            if (nums[i] > target)
                break; // no need to proceed further

            temp.add(nums[i]);
            findCombinations(nums, target - nums[i], i + 1, temp, result); // i+1 because each number used once
            temp.remove(temp.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(nums); // sort to handle duplicates & maintain non-descending order

        List<List<Integer>> result = new ArrayList<>();
        findCombinations(nums, target, 0, new ArrayList<>(), result);

        // Print result
        for (List<Integer> comb : result) {
            for (int i = 0; i < comb.size(); i++) {
                System.out.print(comb.get(i));
                if (i != comb.size() - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
