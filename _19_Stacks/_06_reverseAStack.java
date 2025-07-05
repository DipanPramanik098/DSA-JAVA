import java.util.*;
public class _06_reverseAStack {
    public static void pushBottom(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int x=s.pop();
        pushBottom(s, data);
        s.push(x);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(3);
        s.push(2);

        reverseStack(s);

        printStack(s);
    }
}
