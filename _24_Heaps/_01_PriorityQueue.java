import java.util.Comparator;
import java.util.PriorityQueue;

public class _01_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+ " ");
            pq.remove();
        }

        System.out.println();

        pq1.add(3);
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);

        while (!pq1.isEmpty()) {
            System.out.print(pq1.peek() + " ");
            pq1.remove();
        }
    }
}
