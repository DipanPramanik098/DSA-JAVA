import java.util.LinkedList;
import java.util.Queue;

public class _06_StackUsingTwoQueue {
    public class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q1.isEmpty())
                q1.add(data);
            else
                q2.add(data);
        }

        public int pop() {
            if (isEmpty())
                return -1;
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {

                    top = q1.remove();
                    if (q1.isEmpty())
                        break;
                    q2.add(top);
                }
            } else {
                // q2 is not empty
                while (!q2.isEmpty()) {

                    top = q2.remove();
                    if (q2.isEmpty())
                        break;
                    q1.add(top);
                }
            }
            return top;
        }

        public  int peek() {
            if (isEmpty())
                return -1;
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {

                    top = q1.remove();

                    q2.add(top);
                }
            } else {
                // q2 is not empty
                while (!q2.isEmpty()) {

                    top = q2.remove();

                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        _06_StackUsingTwoQueue obj = new _06_StackUsingTwoQueue();
        Stack s = obj.new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop();
        }
    }
}
