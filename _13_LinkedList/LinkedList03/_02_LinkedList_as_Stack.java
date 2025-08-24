
public class _02_LinkedList_as_Stack {
    /*
     * ✅ Stack Operations Recap
     * 
     * push(x) → insert at top → (in LinkedList, we can use addFirst())
     * 
     * pop() → remove from top → (in LinkedList, removeFirst())
     * 
     * peek() / top() → get the top element → (getFirst())
     * 
     * size() → number of elements
     * 
     * isEmpty() → check if empty
     * 
     * All can be done in O(1) if we maintain head + size.
     */


     // Node class
    private class Node {
        int data;
        Node next;
    }

    // Stack properties
    private Node head; // top of stack
    private int size;

    // Push -> add at front
    public void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Pop -> remove from front
    public int pop() throws Exception {
        if (head == null) {
            throw new Exception("Stack Underflow (Empty Stack)");
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Peek -> get top element
    public int peek() throws Exception {
        if (head == null) {
            throw new Exception("Stack is Empty");
        }
        return head.data;
    }

    // Size of stack
    public int size() {
        return size;
    }

    // Is Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display stack (top to bottom)
    public void display() {
        System.out.println("Stack (Top -> Bottom):");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main to test
    public static void main(String[] args) throws Exception {
        _02_LinkedList_as_Stack st = new _02_LinkedList_as_Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display(); // 40 -> 30 -> 20 -> 10 -> NULL

        System.out.println("Peek: " + st.peek()); // 40
        System.out.println("Pop: " + st.pop()); // removes 40
        st.display(); // 30 -> 20 -> 10 -> NULL

        System.out.println("Size: " + st.size()); // 3
        System.out.println("Is Empty: " + st.isEmpty()); // false

        st.pop();
        st.pop();
        st.pop();
        System.out.println("Is Empty after removing all: " + st.isEmpty()); // true
    }
}
