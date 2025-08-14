import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _02_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println(arr);

        // add, remove, set, get, size()
        System.out.println(arr.size());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        System.out.println(arr.size());

        // insert between 20 and 30 
        // arr.add(index, value)
        arr.add(2,100);
        System.out.println(arr);
        System.out.println(arr.size());

        // sort 
        // Collections.sort(arr);

        // get
        System.out.println(arr.get(2));
        // Collections.reverse(arr);
        System.out.println(arr);

        // set - update index,val
        arr.set(3,999);
        System.out.println(arr);


        // remove index
        System.out.println(arr.remove(2));
        System.out.println(arr);
        


    }
}
