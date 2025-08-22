public class _05_getLast {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Note: Traverse in Linked List
    public void display() {
        System.out.println("=====================================");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("=====================================");
    }

    // Note: Add Last
    public void addLast(int data) {
        Node newElement = new Node();
        newElement.data = data;
        newElement.next = null;

        if (head == null) {
            head = newElement;
            tail = newElement;
        } else {
            tail.next = newElement;
            tail = newElement;
        }
        size++;
    }

    // Note: Add First
    public void addFirst(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Note: Get First Element
    public int getFirst() throws Exception {
        if (head == null) {
            throw new Exception("Linked List is Empty");
        }
        return this.head.data;
    }

    // Note: Get Last Element
    public int getLast() throws Exception {
        if (head == null) {
            throw new Exception("Linked List is Empty");
        }
        return this.tail.data;
    }

    public static void main(String[] args) {
        try {
            _05_getLast list = new _05_getLast();

            // Adding elements
            list.addLast(20);
            list.addLast(30);
            list.addFirst(10);
            list.addFirst(5);

            // Display the list
            list.display();

            // Get first and last elements
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
