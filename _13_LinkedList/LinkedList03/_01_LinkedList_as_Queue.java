public class _01_LinkedList_as_Queue {

    /*
     * ✅ Queue Operations Recap
     * 
     * enqueue(x) → insert at end → addLast()
     * 
     * dequeue() → remove from front → removeFirst()
     * 
     * peek() / getFront() → return front element → getFirst()
     * 
     * size() → number of elements
     * 
     * isEmpty() → check if queue is empty
     * 
     * All in O(1) time if we maintain head, tail, size.
     */
    // Node class
    private class Node {
        int data;
        Node next;
    }

    // Queue properties
    private Node head; // front
    private Node tail; // rear
    private int size;

    // Enqueue -> add at last
    public void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) { // empty queue
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Dequeue -> remove first
    public int dequeue() throws Exception {
        if (head == null) {
            throw new Exception("Queue is Empty");
        }
        int val = head.data;
        head = head.next;
        size--;

        if (head == null) { // queue became empty
            tail = null;
        }

        return val;
    }

    // Get front element
    public int getFront() throws Exception {
        if (head == null) {
            throw new Exception("Queue is Empty");
        }
        return head.data;
    }

    // Size of queue
    public int size() {
        return size;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display queue elements
    public void display() {
        System.out.println("Queue: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Main to test
    public static void main(String[] args) throws Exception {
        _01_LinkedList_as_Queue q = new _01_LinkedList_as_Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display(); // 10 <- 20 <- 30 <- 40 <- END

        System.out.println("Front: " + q.getFront()); // 10
        System.out.println("Dequeue: " + q.dequeue()); // removes 10
        q.display(); // 20 <- 30 <- 40 <- END

        System.out.println("Size: " + q.size()); // 3
        System.out.println("Is Empty: " + q.isEmpty()); // false

        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Is Empty after removing all: " + q.isEmpty()); // true
    }
}
