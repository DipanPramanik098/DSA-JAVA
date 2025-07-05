import java.util.Deque;
import java.util.LinkedList;

public class _10Deque {
    public static void main(String[] args) {
        Deque<Integer>dq = new LinkedList<>();

        dq.addLast(5);
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
    }    
}
