import java.util.LinkedList;
public class LinkedList2 {
    public static void main(String[] args) {
        // create
        LinkedList<Integer>ll = new LinkedList<>();
        // add
        ll.addLast(10);
        ll.addLast(11);
        ll.addFirst(1);
        ll.addFirst(2);
        //2->1->10->11

        //print
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
