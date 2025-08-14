import java.util.ArrayList;

public class _03_printList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        

        // add, remove, set, get, size()
        System.out.println(arr.size());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
