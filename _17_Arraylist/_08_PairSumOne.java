import java.util.*;

public class _08_PairSumOne {
    public static boolean find(ArrayList<Integer> list, int target) {
        int left =0, right = list.size()-1;
        while(left != right){
            if(list.get(left)+  list.get(right)  == target) return true;
            else if(list.get(left) + list.get(right) < target) left++;   
            else right--;
        }
        return false;  // If no pair found return false; 
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;
        System.out.println(find(list,target));
    }
}
