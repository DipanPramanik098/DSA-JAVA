import java.util.LinkedList;
import java.util.Queue;

public class _08_InterleaveTwoHalf {

    public static void interLeave(Queue<Integer>q){
        int size = q.size();
        // first queue
        Queue<Integer>first = new LinkedList<>();

        // info: adding first half in the first q
        int i=1;
        while(i<=size/2){
            first.add(q.remove());
            i++;
        }

        // interleave
        while(!first.isEmpty()){
            // add first
            q.add(first.remove());
            // remove original q then add in oruiginal q
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
