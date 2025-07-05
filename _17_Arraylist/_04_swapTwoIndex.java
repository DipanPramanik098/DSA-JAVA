import java.util.*;
public class _04_swapTwoIndex {
    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list);
        swap(list, 2, 4);
        System.out.println("List after swapping 2nd and 4th elements: " + list);
    }
}
