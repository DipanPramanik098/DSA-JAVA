import java.util.*;
public class _09_PairSumTwo {
    public static boolean find(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // Find pivot (index of the largest element)
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get((i + 1) % n)) {
                pivot = i;
                break;
            }
        }

        int left = (pivot + 1) % n; // Smallest element
        int right = pivot;          // Largest element

        // Two pointer approach with circular indexing
        while (left != right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target)
                return true;
            else if (sum < target)
                left = (left + 1) % n;
            else
                right = (n + right - 1) % n;
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(find(list,target));
    }
}
