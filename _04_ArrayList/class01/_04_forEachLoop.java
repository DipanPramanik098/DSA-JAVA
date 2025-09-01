import java.util.ArrayList;

public class _04_forEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // System.out.println(arr);

        // add, remove, set, get, size()
        // System.out.println(arr.size());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        for (int it : arr) {
            System.out.println(it);
        }

        char ch[] = { 'a', 'b', 'c', 'd', 'e' };

        for (char c : ch) {
            System.out.println(c);
        }

        // note: By default initial capacity of arraylist - 10, grows 1.5x

        ArrayList<Integer> arr2 = new ArrayList<>(90); // now the initial capacity is 90
    }
}
