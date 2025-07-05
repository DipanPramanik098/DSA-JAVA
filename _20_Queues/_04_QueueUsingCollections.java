import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _04_QueueUsingCollections {
    public static void main(String[] args) {
        // ll or ArrayDeque
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("========================");
        q1.add(2);
        q1.add(0);
        q1.add(9);
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
