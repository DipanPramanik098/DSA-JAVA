import java.util.Deque;
import java.util.LinkedList;

public class _11_StacklQueue {
    static class Stack{
        Deque<Integer>dq = new LinkedList<>();

        public void push(int data){
            dq.addLast(data);
        }
        public void pop(int data){
            dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(1);
        s.push(3);
        s.push(2);
        System.out.println(s.peek());
    }
}
