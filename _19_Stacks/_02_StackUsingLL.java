
public class _02_StackUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head = null;

        public boolean isEmpty(){
            return head==null;
        }
        // push
        public void push(int data){  
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }else{
                newNode.next = head;
                head=newNode;
            }
        }
        // pop
        public int pop(){
            int top = head.data;
            if(isEmpty()){
                return -1;
            }else{
                Node temp=head;
                head=temp.next;
                temp.next=null;
            }
            return top;
        }
        // peek
        public int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
