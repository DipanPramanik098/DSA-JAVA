import java.util.Stack;
public class _04_pushBottom {
    public static void pushBottom(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int x=s.pop();
        pushBottom(s, data);
        s.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(3);
        s.push(2);

        pushBottom(s,4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
